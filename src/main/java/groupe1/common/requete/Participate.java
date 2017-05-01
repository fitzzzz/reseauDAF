package groupe1.common.requete;

import common.Requete;

import java.util.ArrayList;
import java.util.List;

import static common.Code.PARTICIPATE;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class Participate extends Requete {

    public Participate(int id) {
        super(PARTICIPATE.name());
        List<Object> parametre = new ArrayList<>();
        parametre.add(id);
        this.params = parametre;
    }
}
