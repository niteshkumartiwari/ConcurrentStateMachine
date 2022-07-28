package statemachine;

import model.Workflow;

import java.util.Optional;

public class ValidateState extends State<Workflow, Workflow> {
    protected Workflow process(Workflow workflow) throws InterruptedException {
        synchronized (ValidateState.class){
            System.out.println("Validate started: "+ Thread.currentThread().getName());
            Thread.sleep(10);
            System.out.println("Validate ended: "+ Thread.currentThread().getName());
        }

        return workflow;
    }

    protected Optional<State> getNextState() {
        return Optional.of(new BindState());
    }
}
