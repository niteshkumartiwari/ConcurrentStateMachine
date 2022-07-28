package statemachine;

import model.Workflow;

import java.util.Optional;

public class DepartState  extends State<Workflow, Workflow> {
    @Override
    protected void preProcess(Workflow workflow) {
        System.out.println("Depart Preprocessing");
    }

    protected Workflow process(Workflow workflow) throws InterruptedException {
        synchronized (DepartState.class){
            System.out.println("Depart started: "+ Thread.currentThread().getName());
            Thread.sleep(10);
            System.out.println("Depart ended: "+ Thread.currentThread().getName());
        }

        return workflow;
    }

    protected Optional<State> getNextState() {
        return Optional.empty();
    }
}

