package statemachine;

import java.util.Optional;

public abstract class State<Input, Output> {
    public void execute(Input input) throws InterruptedException {
        preProcess(input);
        Output output= process(input);
        postProcess(input,output);

        // Execute to next state
        Optional<State> nextState= getNextState();
        if(nextState.isPresent()){
            nextState.get().execute(output);
        }
    }

    protected void preProcess(Input input){
        // Not enforcing the child classes to have this functionality
    }

    protected void postProcess(Input input, Output output){
        // Not enforcing the child classes to have this functionality
    }

    protected abstract Output process(Input input) throws InterruptedException;
    protected abstract Optional<State> getNextState();
}
