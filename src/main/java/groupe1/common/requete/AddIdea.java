package groupe1.common.requete;

import common.Idea;
import common.Requete;

import java.util.ArrayList;
import java.util.List;

import static common.Code.ADD_IDEA;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class AddIdea extends Requete {
    public AddIdea(Idea idea) {
        super(ADD_IDEA.name());
        List<Object> parametres = new ArrayList<>();
        parametres.add(idea);
        this.params = parametres;
    }
}
