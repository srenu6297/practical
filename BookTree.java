//Author name : Renu Sharma
/*
 * 2. Write a Java program to create a new tree set and add above ArrayLists in TreeSet.
    Get the number of elements in  tree set and print first and last element of treeset.

 */

package Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;



public class BookTree 
{
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

		System.out.println("\n\n\n\n.......................TreeSet List........\n\n");
		
		TreeSet<Book> set = new TreeSet<Book>();
		
		set.addAll(l1);
		set.addAll(l2);
		
		for(Book s:set)
		{
			
			System.out.println(s);
		}
		
		System.out.println("\nFirst Element : " +set.first());
		System.out.println("last Element : "+set.last());
	}

}
