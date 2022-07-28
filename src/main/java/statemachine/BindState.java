package statemachine;

import model.Workflow;

import java.util.Optional;

public class BindState  extends State<Workflow, Workflow> {
    protected Workflow process(Workflow workflow) throws InterruptedException {
        synchronized (BindState.class){
            System.out.println("Bind started: "+ Thread.currentThread().getName());
            Thread.sleep(10);
            System.out.println("Bind ended: "+ Thread.currentThread().getName());
        }

        return workflow;
    }

    protected Optional<State> getNextState() {
        return Optional.of(new PrepState());
    }
}
