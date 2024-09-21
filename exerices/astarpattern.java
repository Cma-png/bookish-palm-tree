import java.util.Scanner;
public class Pattern 
{
	public static void main(String[] args) 
	{
		int Number;
		Scanner input=new Scanner(System.in);
		Number=input.nextInt();
        PrintPattern(Number);
	}
	
	public static void PrintPattern(int Number)
	{
	    for(int i = 1; i<= Number; i++) 
	       {
	           System.out.print("*");
	            PrintStars(Number - i);
	 }
	        
	 }
	
	public static void PrintStars(int Number)
	{
    	for (int j = 0; j <= Number-1 ; j++)
    	{
    	    System.out.print("*");
    	}
        System.out.println();
	}
}
