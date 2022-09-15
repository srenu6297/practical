//Author name : Renu Sharma
/*
 * 1.WAP to create 2 ArrayLists list1 and list2 and add 3 objects of Book in each list
 and print elements of both ArrayLists one on one line.

 */

package Book;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	public static void main(String[] args) 
	{
		List<Book>l1=new ArrayList<>();
		Book b1=new Book(200,"English","William Shakespeare...");
		Book b2=new Book(300,"Computer","Sushil Goel...");
		Book b3=new Book(1200,"Java","HerBert Schildt...");
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		System.out.println("..........First List..........\n");
		for(Book e:l1)
		{
			
			System.out.println(e);
		}
		
		List<Book>l2=new ArrayList<>();
		Book bb1=new Book(250,"Hindi","Nagarjun...");
		Book bb2=new Book(350,"Data Structure","Sushil Goel...");
		Book bb3=new Book(1300,"Software Engineering","HerBert Schildt...");
		l2.add(bb1);
		l2.add(bb2);
		l2.add(bb3);
		System.out.println("\n..........Second List..........\n");
		for(Book ee:l2)
		{
			
			System.out.println(ee);
		}


	}

}
