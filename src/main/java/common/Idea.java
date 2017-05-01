package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author François Melkonian
 */
public class Idea implements Serializable{
	private String description;
	private List<String> technologiesEnvisagees;
	private String etudiant;
	private String email;

	public Idea(String description, List<String> technologiesEnvisagees, String etudiant, String email) {
		this.description = description;
		this.technologiesEnvisagees = technologiesEnvisagees;
		this.etudiant = etudiant;
		this.email = email;
	}

	public Idea(String description, String etudiant, String email) {
		this(description,new ArrayList<String>(),etudiant,email);
	}

	public String getDescription() {
		return description;
	}

	public List<String> getTechnologiesEnvisagees() {
		return technologiesEnvisagees;
	}

	public String getEtudiant() {
		return etudiant;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return description+"\n"+etudiant+"<"+email+">\n"+technologiesEnvisagees;
	}
}
