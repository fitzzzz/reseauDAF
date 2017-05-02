package common;

import java.io.Serializable;
import java.util.List;

/**
 * Created by DavidLANG on 25/04/2017.
 */
public class Response implements Serializable {
    protected List<?> responses;

    public Response() {}
    public Response(List<?>  responses) {
        this.responses = responses;
    }

    public List<?> getResponses() {
        return responses;
    }
    public String toString(){
        return responses.toString();
    }
}
