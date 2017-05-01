package groupe1.common.response;

import common.Idea;
import common.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetIdeaResponse extends Response {
    public GetIdeaResponse(List<Idea> ideas) {
        List<Object> objects = new ArrayList<>();
        objects.add(ideas);
        this.responses = objects;
    }
}
