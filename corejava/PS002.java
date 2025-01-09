import java.util.Scanner;
class PS002
{
	public static void main(String arg[])	
	{
	    int n;
            Scanner scanner =new Scanner(System.in);
	    
	    System.out.println("Enter any number:");
	    n=scanner.nextInt();
	    boolean status=checkMultiple(n);
	    System.out.println("Is entered number is multiple of 100 :"+status);	    
	      
	}
	static boolean checkMultiple(int n)
	{
	if (n%100==0)
	   return true;
	return false;
	}
}