package collections;


public class ObjectArray2 {

	public static void main(String[] args) {

		
		Object[] arr=new Object[3];
		
		arr[0]=100;
		arr[1]=true;
		arr[2]="anand";
		
		//Object is superclass
		//Hence can store all datatypevalues in single object array
		
		/*
		 * for (int i=0; i<arr.length; i++) 
		 * {
		 *  System.out.println(arr[i]); 
		 *  }
		 */
		
		for(Object o:arr) //enhanced for loop , Object->data type,o->variable, arr->object name
		{
			System.out.println(o);
		}
		
		int[] str=new int[5];
		str[0]=1;
		str[1]=2;
		str[2]=3;
		str[3]=4;
		str[4]=5;
		
		for(int s:str) //enhanced for loop
		{
			System.out.println(s);
		}
		
		
	}

}
