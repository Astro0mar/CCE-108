// Java program to find the sum of the given series
import java.util.Scanner;
 
public class P2 {
 
    // Function to return the sum of the series
    public static float getSum(int a, int n)
    {
        // variable to store the answer
        float sum = 0;
        for (int i = 1; i <= n; ++i) {
 
            // Math.pow(x, y) returns x^y
            sum += (i / Math.pow(a, i));
        }
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a = 3, n = 3;
 
        // Print the sum of the series
        System.out.println(getSum(a, n));
    }
}


//  https://www.geeksforgeeks.org/program-to-find-the-sum-of-the-series-1-a-2-a2-3-a3-n-an/
//  Another similar idea
//  https://www.geeksforgeeks.org/program-find-sum-series-a11-a22-a33-a44-ann/
