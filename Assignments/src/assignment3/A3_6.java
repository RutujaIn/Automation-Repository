package assignment3;

public class A3_6 {
	/**
	* @param args
	 * @throws Exception 
	*/
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int a=divide(4,2);
		System.out.println(a);
		int b=divide(4,0);

		System.out.println(b);

		}
		public static int divide(int a,int b) throws Exception{
		int result = a/b;
		return result;


	}

}
