
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		
		
   Scanner num = new Scanner(System.in);
   System.out.println("Enter an integer number");

   //We will find the factorial of this number
        int number = num.nextInt();
        long fact = 1;
		
		
		
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
		
		
		
		
	}

}
