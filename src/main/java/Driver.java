import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Req;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) throws JsonProcessingException {
        List<String> batchList= Arrays.asList("b1","b2","b3","b4","b5","b6","b7","b8","b9","b10");

        Executor executor= new Executor();
        executor.execute(batchList);
    }
}
