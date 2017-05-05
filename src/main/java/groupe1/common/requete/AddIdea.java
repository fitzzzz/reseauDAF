package groupe1.common.requete;

import common.Idea;
import common.Request;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static common.Code.ADD_IDEA;

/**
 * Created by DavidLANG on 01/05/2017.
 */
public class AddIdea extends Request {
    public AddIdea(Idea idea) {
        super(ADD_IDEA.name());
        List<Object> parametres = new ArrayList<>();
        parametres.add(idea);
        this.params = parametres;
    }

    public AddIdea() {
        super(ADD_IDEA.name());
        List<Object> parameters = new ArrayList<>();
        parameters.add(constructorIdea());
        this.params = parameters;
    }

    private Idea constructorIdea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donnez la description de votre idée");
        String description = scanner.nextLine();
        List<String> technologies = new LinkedList<>();
        boolean finish = false;
        String nextLine;
        while (!finish) {
            System.out.println("Donnez vos technologies envisagées une par une : tapez \"finis\" quand toute vos technologies ont été données.");
            nextLine = scanner.nextLine();
            if (!nextLine.equals("finis")) {
                technologies.add(nextLine);
            } else {
                finish = true;
            }
        }
        System.out.println("Donnez le nom de l'étudiant");
        String nom = scanner.nextLine();
        System.out.println("Donnez l'email");
        String email = scanner.nextLine();
        return new Idea(description, technologies, nom, email);
    }
}
