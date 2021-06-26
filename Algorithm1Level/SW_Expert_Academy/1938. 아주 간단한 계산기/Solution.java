import java.util.Scanner;
import java.io.FileInputStream;



class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        A=sc.nextInt();
        B=sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
    }
}