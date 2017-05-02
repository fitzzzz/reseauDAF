package groupe2.protocol;

import common.Idea;
import common.Requete;
import common.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author François Melkonian
 */
public class MyProtocol {
	private List<Idea> ideas;
	public MyProtocol(){
		ideas = new ArrayList<Idea>();
	}
	public Response respond(Requete requete){
		if(requete.getCode().equals("get")){

			return new Response(ideas);
		}else if(requete.getCode().equals("add")){
			Idea params = (Idea) requete.getParams().get(0);
			ideas.add(params);
			return new Response(new ArrayList<String>());
		}
		return new Response(new ArrayList<String>());
	}
	public String show(){
		return ideas.toString();
	}
}
