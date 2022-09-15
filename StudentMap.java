//Author name : Renu Sharma
/*
 * 3. WAP to create a HashMap and add 5 student's id(101,102,103,104,105) as key and name as value.
   Print the name of students whose id is greater than 103.

 */

package Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "Renu");
		map.put(102, "Ritu");
		map.put(103, "Anju");
		map.put(104, "Monika");
		map.put(105, "Pallavi");
		
		Set<Integer> keys=map.keySet();
		for(Integer e:keys)
		{
			if( e.intValue()>103)
			{
			System.out.println(map.get(e));
		    }
		}
		
	}

}
