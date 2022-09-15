//Author name : Renu Sharma
/*
 * Create a class Book with 3 private data members:
-bid
-subject
-author
 */

package Book;

public class Book implements Comparable<Book>
{
	private int bid;
	private String subject;
	private String author;
	
	public Book() 
	{
		super();
	}

	public Book(int bid, String subject, String author) {
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.subject.compareTo(o.getSubject());
		//return 0;
		
	}
	
	
}
