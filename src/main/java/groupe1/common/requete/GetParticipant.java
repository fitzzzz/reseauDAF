package groupe1.common.requete;

import common.Request;

import java.util.ArrayList;
import java.util.List;

import static common.Code.GET_PARTICIPANT;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class GetParticipant extends Request {

    public GetParticipant(int id) {
        super(GET_PARTICIPANT.name());
        List<Object> parametre = new ArrayList<>();

        parametre.add(id);
        this.params = parametre;
    }
}
