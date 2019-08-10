package assignment1;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find smallest number in integer array
		
		int[] a = new int[] { 20, 30, 50, 4, 71, 100};
		
		int min = a[0]; //  assume first elements as smallest number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
		
			if (a[i] < min) 
			{
				min = a[i];
			}
		}
		
		
		System.out.println("Smallest Number in a given array is : " + min);


	}

}
