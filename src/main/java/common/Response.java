package common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Response implements Serializable {
    List<?> responses;

    public Response(List<?>  responses) {
        this.responses = responses;
    }

    public List<?> getResponses() {
        return responses;
    }
}
