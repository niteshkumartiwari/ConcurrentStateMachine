
import model.Request;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {
    private ThreadPoolExecutor executor= (ThreadPoolExecutor) Executors.newFixedThreadPool(10);

    public void execute(List<String> batchIds){
        batchIds.forEach(e-> executor.execute(new BatchTransferExecutor(new Request(e))));
    }
}
