package groupe1.common;

import common.Idea;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class IdeaModel {

    //Singleton
    private static IdeaModel instance = new IdeaModel();

    // List des Idées
    private static List<Idea> ideaList = new ArrayList<>();
    private static int id = 0;

    private IdeaModel() {
    }

    public static IdeaModel getInstance() {
        return instance;
    }

    public int add(Idea idea) {
        if (!ideaList.add(idea))
            return -1;
        idea.setId(id);
        ideaList.add(idea);
        return id++;
    }

    public List<Idea> getIdeas() {
        return ideaList;
    }

}
