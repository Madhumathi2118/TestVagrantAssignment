package TestVagrant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class subscriptionProblem {


	
	public static void getNewspaper(Double n) 
	
	{
			
		String[] a= new String[2];
String[] b= new String[4];
		Double [] values= {26.0,20.5,34.0,10.5,18.0};
		
		String [] newspaper= {"TOI","Hindu","ET","BM","HT"};

		Double sum=0.0;
	int	count=0;

		
for (int i=0;i<values.length;i++) {
	
	for (int j=i+1; j<values.length; j++) {

		 a= new String[2] ;
		 sum= values[i]+values[j];
		 
		
		if (sum<=n) {
			
			

			a[0]=newspaper[i];
			a[1]=newspaper[j];
			
			b[count]=Arrays.toString(a);
			 a= new String[] {};
			count++;




		}
		}

		}

		
System.out.println(Arrays.toString(b));	

		
	}
	
	
	
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subscriptionProblem s=new subscriptionProblem();
	s.getNewspaper(40.0);

	}

}
