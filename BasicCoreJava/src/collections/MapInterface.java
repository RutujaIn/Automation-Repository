package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) 
	{
		//Hashmap - synchronized (threadsafe - no impact of one code in multiple threads)
		
		 /* Map<String, Integer> map=new HashMap<String, Integer>();
		  map.put("ananad",30);
		  map.put("abhishek",27); 
		  map.put("ayushi",24);
		  map.put(null, 50); //accepts null value
		 // System.out.println(map.get("abhishek"));
		  System.out.println(map.get(null)); */

		 

		
		//Hashtable - non synchronized
		 Map<String, Integer> map=new Hashtable<String, Integer>();
		 map.put("ananad",30);
		 map.put("abhishek",27);
		 map.put("ayushi",24);
		 //map.put(null,50); //do not accept null value
		 map.put("abhishek",28); 

		 //System.out.println(map.get(null));
		 System.out.println(map.get("abhishek"));
		 
         Set<String> set=map.keySet();
         
         for(String s:set)
         {
        	 System.out.println(map.get(s));
         }
		 
		 
		 
	}

}
