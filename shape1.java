// Author name : Renu Sharma

/* Create a class named 'Shape' with a method to print "This is This is shape".
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 both having a method to print "This is rectangular shape" and
  "This is circular shape" respectively.
  
 Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle".
 Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class. 
 */

package practical;

class shape {

		public void print_shape()
		{
			System.out.println("This is a Shape");
		}
    }

// rectangle class is subclass of shape class.
class Rectangle extends shape{
	
	public void print_rect()
	{
		System.out.println("This is a rectangular shape");
	}
}

//circle class is subclass of shape class.
class Circle extends shape{
	public void print_circle()
	{
		System.out.println("This is a circle shape");
	}
}

//square class is subclass of rectangle class.
 class Square extends Rectangle{
	 public void print_square()
	 {
		 System.out.println("Square is Rectangle");
	 }
}
		
		
   // main class
	public class shape1 {

	public static void main(String[] args) {
		
		Square sqr=new Square();
		sqr.print_shape();
		sqr.print_rect();
		
	}
}
