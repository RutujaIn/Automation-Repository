package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) 
	{
		/* import java.util , null not allowed
		 * //Hashset Random access Set<Integer> set=new HashSet<>();//Integer->Class as
		 * primitive data types are not allowed in collections set.add(10); set.add(20);
		 * set.add(30); set.add(40); set.add(30);//only unique entries allowed, no
		 * duplication set.add(40); for(int a:set) { System.out.println(a); // }
		 */
		

		 //Linked Hashset - ordered
		/*
		 * Set<Integer> set=new LinkedHashSet<>();//Integer->Class as primitive data
		 * types are not allowed in collections set.add(10); set.add(20); set.add(30);
		 * set.add(40); set.add(30);//only unique entries allowed, no duplication
		 * set.add(40);
		 * 
		 * for(int a:set) { System.out.println(a); }
		 */
		
          //Tree set - sorted
		  Set<Integer> set=new TreeSet<>();//Integer->Class as primitive data types are not allowed in collections
		   set.add(30);
		   set.add(40); 
		   set.add(30);
		   set.add(40);
		   set.add(10);//only unique entries allowed, no duplication
		   set.add(20);
		 
		/*
		 * for(int a:set) 
		 * { 
		 * System.out.println(a);
		 * }
		 */
		 
		 Iterator<Integer> it=set.iterator(); //ctrl+shift+o -> import
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }

	}

}
