package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) 
	{

		/*
		 * List<String> list = new ArrayList<>();//<String>->Generic.If non-generic,can
		 * store all data types list.add("anand"); list.add("bhayre");
		 * list.add("Techbodhi");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		
         //LinkedList
		 //List<String> list = new LinkedList<String>();import java.util
		/*
		 * List<String> list = new LinkedList<>();//<String>->Generic.If non-generic,can
		 * store all data types list.add("anand"); list.add("bhayre");
		 * list.add("Techbodhi");
		 * 
		 * for(String s:list) { System.out.println(s); }
		 */
		 
          //Vector
		  List<String> list = new Vector<>();//<String>->Generic.If non-generic,can store all data types 
		  list.add("anand"); //Object different,Same reference,List is interface & superclass of all list types
		  list.add("bhayre");
		  list.add("Techbodhi");
		  list.add("bhayre"); //list->Duplicate entries allowed
		  list.add("Techbodhi");
		  
		  for(String s:list) 
		  { 
			  System.out.println(s); 
		  }
		 
		
	}

}
