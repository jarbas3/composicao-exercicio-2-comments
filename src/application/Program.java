package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date moment = sdf.parse("21/06/2018 13:05:44");
		String title = "Traveling to New Zealand";
		String content = "I'm going to visit this wonderful country!";
		int likes = 12;		
		Post post1 = new Post(moment, title, content, likes);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		moment = sdf.parse("28/07/2018 23:14:19");
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;		
		Post post2 = new Post(moment, title, content, likes);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println(post2);
	}
}
