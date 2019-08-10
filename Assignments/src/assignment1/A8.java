package assignment1;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the greatest number in a array
		
		int[] str=new int[5];
		
		str[0]=1;
		str[1]=2;
		str[2]=3;
        str[3]=4;
		str[4]=5;
		
		for (int i=0; i<=4; i++)
		{
			if(str[i]%5==0)
			{
				System.out.println(str[i]);
			}
		}
		
		}

}
		
