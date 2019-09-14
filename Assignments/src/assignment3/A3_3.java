package assignment3;

public class A3_3 {
	
	/**
	* @param args
	*/
	static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int o[] = new int[2];

		try{
		o[3]=23;
		o[1]=33;
		}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
		}

		System.out.println("2nd pos --"+o[1]);


	}

}
