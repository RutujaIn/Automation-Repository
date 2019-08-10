package assignment1;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find largest number in integer array
		
		/*int[] a = new int[] { 20, 30, 50, 4, 71, 100};
		int max = a[0];
		for(int i = 1; i < a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		
		System.out.println("The Given Array Element is:");
		for(int i = 0; i < a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("From The Array Element Largest Number is:" + max);
		
	    }*/
		
		int[] arr= {1,8,3,4,7,5,5,1};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
		

}
}

