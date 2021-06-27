import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();

        System.out.print(A-B+1);
    }
}