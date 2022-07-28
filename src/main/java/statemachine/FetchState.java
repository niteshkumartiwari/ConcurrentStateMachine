package statemachine;

import model.Request;
import model.Workflow;

import java.util.Optional;

public class FetchState extends State<Request, Workflow> {

    protected Workflow process(Request request) throws InterruptedException {
        synchronized (FetchState.class){
            System.out.println("Fetch started: "+ Thread.currentThread().getName());
            Thread.sleep(10);
            System.out.println("Fetch ended: "+ Thread.currentThread().getName());
        }

        return new Workflow(request.getBatchId());
    }

    protected Optional<State> getNextState() {

        return Optional.of(new ValidateState());
    }
}