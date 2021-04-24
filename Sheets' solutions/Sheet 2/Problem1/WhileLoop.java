import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		
		
     Scanner input = new Scanner(System.in);
     System.out.println("Enter an integer number");

		//We will find the factorial of this number
        int number = input.nextInt();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
		
		
		
	}

}
