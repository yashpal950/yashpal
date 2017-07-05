import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


	

public class Ecart {
	

	public static void main(String[] args) {
		int i;
		int counter = 0;
		//int flag = 1;
		char key=' ';
		int count=0;
		System.out.println("press 0");
		   
		 try{
			 	key = (char)System.in.read();
		 	}
		catch(IOException e)
			{
		
			}
	switch (key)
	{
	case '0': System.out.println("Add product");
				System.out.println("How many product you want to add");
				Scanner sc = new Scanner(System.in);
				String myarr[] = new String[100];
				int numberOfProduct = sc.nextInt();
				for( i=0;i<=numberOfProduct;i++)
				{
					myarr[i] = sc.nextLine();
					
				}
				
			
				System.out.println("please enter the String to find out");
				String findstring = sc.nextLine();
				
				for(int j =0;j<=numberOfProduct;j++)
				{
				
					if(	myarr[j].contains(findstring))
					{
						
						
						counter  = counter+1;				
					}		
				
				
				}
				
				System.out.println(counter);
				
				System.out.println("enter starting string");
				String str = sc.nextLine();
				
				
				for(int j =0;j<=numberOfProduct;j++)
				{
				
					if(	myarr[j].startsWith(str))
					{
						System.out.println("String Found");
						
						count  = count+1;				
					}		
				
				
				}
				System.out.println(count);
			/*	for(int j=0;j<=numberOfProduct;j++)
			{
					if(myarr[j].contains("cup"))
				{
						
					counter  = numberOfProduct;
				}
					
			}*/
				
				break;
	
		
	
		       
	default: System.out.println("Not allowed!"); break;

		}
	}

}
