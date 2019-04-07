package course.Pratica.ProjetopPostComExemploStringBuilder.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import course.Pratica.ProjetopPostComExemploStringBuilder.Entities.Comment;
import course.Pratica.ProjetopPostComExemploStringBuilder.Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tenha uma boa viagem!");
		Comment c2 = new Comment("Nossa! Que legal!");
		Post p1 = new Post(sdf.parse("20/06/2018 13:05:44"), "Viajando para Nova Zelândia",
				"Eu vou visitar esse país maravilhoso", 13);

		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);

		System.out.println("----------------------------------------");

		Comment c3 = new Comment("Boa noite!");
		Comment c4 = new Comment("Que a Força esteja com você!");
		Comment c5 = new Comment("Fuck you!");
		
		Post p2 = new Post(sdf.parse("28/07/2018 12:05:45"), "Good night guys!", "See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);
		p2.addComment(c5);
		
		System.out.println(p2);
		
		p2.removeComment(c5);
		System.out.println("----------------------------------------");
		System.out.println(p2);
	}

}
