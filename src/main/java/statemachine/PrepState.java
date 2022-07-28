package statemachine;

import model.Workflow;

import java.util.Optional;

public class PrepState  extends State<Workflow, Workflow> {
    protected Workflow process(Workflow workflow) throws InterruptedException {
        synchronized (PrepState.class){
            System.out.println("Prep started: "+ Thread.currentThread().getName());
            Thread.sleep(10);
            System.out.println("Prep ended: "+ Thread.currentThread().getName());
        }

        return workflow;
    }

    protected Optional<State> getNextState() {
        return Optional.of(new DepartState());
    }
}

