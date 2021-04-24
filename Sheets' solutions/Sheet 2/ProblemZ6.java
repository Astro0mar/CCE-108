
// Solution by Ziad Hany

package sheet2;
import java.util.Scanner;

public class ProblemZ6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        double sum = number;
        int term = -1, i=1;
        while (i <= 15){
            i+=2;
            sum += term * (Math.pow(number,i)/fact(i));
            term *= -1;
        }
        System.out.println(sum);
    }
    public static long fact(int number){
        long factorial= 1 ;
        while(number >= 1){
            factorial *= number--;
        }
        return factorial;
    }
}
