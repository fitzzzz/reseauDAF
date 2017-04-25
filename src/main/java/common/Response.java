package common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Response {
    List<Object> responses;

    public Response(List<Object> responses) {
        this.responses = responses;
    }

    public List<Object> getResponses() {
        return responses;
    }
}
