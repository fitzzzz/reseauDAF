package groupe1.common.requete;

import common.Request;

import static common.Code.GET_IDEA;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetIdeaRequest extends Request {
    public GetIdeaRequest() {
        super(GET_IDEA.name(), null);
    }
}
