package groupe1.common.response;

import common.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class AddIdeaResponse extends Response{

    public AddIdeaResponse(int id) {
        List<Object> objects = new ArrayList<>();
        objects.add(id);
        this.responses = objects;
    }
}
