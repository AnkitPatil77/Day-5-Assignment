import java.util.Scanner;  
public class LargestNumberExample1  
{  
	public static void main(String[] args)   
{  
int a, b, c, largest, temp;  
                   //object of the Scanner class  
	Scanner sc = new Scanner(System.in);  
	 
	System.out.println("Enter the first number:");  
	a = sc.nextInt();  
	System.out.println("Enter the second number:");  
	b = sc.nextInt();  
	System.out.println("Enter the third number:");  
	c = sc.nextInt();  

	temp = a>b?a:b;  

	largest=c>temp?c:temp;  

	System.out.println("The largest number is: "+largest);  
}  
}