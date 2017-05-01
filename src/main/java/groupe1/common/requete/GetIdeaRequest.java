package groupe1.common.requete;

import common.Requete;

import static common.Code.GET_IDEA;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetIdeaRequest extends Requete {
    public GetIdeaRequest() {
        super(GET_IDEA.name(), null);
    }
}
