import model.Request;
import statemachine.FetchState;

public class BatchTransferExecutor implements Runnable{
    Request request;

    public BatchTransferExecutor(Request request) {
        this.request = request;
    }

    public void run() {
        FetchState fetchState= new FetchState();
        try {
            fetchState.execute(request);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
