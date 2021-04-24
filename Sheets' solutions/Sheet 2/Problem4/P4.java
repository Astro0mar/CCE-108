// A simple Java program to compute
// sum of series 1/1! + 1/2! + .. + 1/n!
import java.io.*;
 
public class P4  {
     
    // Utility function to find
    static int factorial(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
        res *= i;
        return res;
    }
     
    // A Simple Function to return value
    // of 1/1! + 1/2! + .. + 1/n!
    static double sum(int n)
    {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += 1.0/factorial(i);
        return sum;
    }
 
    // Driver program
    public static void main (String[] args)
    {
        int n = 5;
        System.out.println(sum(n));
    }
}


//https://www.geeksforgeeks.org/efficient-program-compute-sum-series-11-12-13-14-1n/
