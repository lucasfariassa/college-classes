package blog.persistence;

import java.util.ArrayList;
import java.util.List;

import blog.model.Post;

public class PostDAO {
	private static List<Post> posts = new ArrayList<Post>();
	
	static {
		
		posts.add(new Post("Mary deveria ter filhos", "Francis precisa de herdeiros! A Fran�a precisa de herdeiros", "momqueen_katherine"));
		posts.add(new Post("Tudo tem seu tempo", "Um dia vamos ter herdeiros. Primeiro, precisamos ter a ordem no reino", "maryofscotland"));
		posts.add(new Post("A Fran�a precisa de equil�brio", "Herdeiros n�o vencem guerras! Precisamos nos preocupar primeiro com o reino", "kingfrancis"));
		posts.add(new Post("O mundo pag�o est� vindo", "Precisamos levar em conta a vingan�a do maligno sobre nossos pecados", "bash_viceroy"));
	}
	
	public List<Post> toList() {
		return posts;
	}

	public void save(Post post) {
		posts.add(post);
		
	}

}
