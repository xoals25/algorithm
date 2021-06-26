import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 다른 사람 코드 보니 수학 계산방식으로 간단하게 만들 수 있다는걸 깨닳았다.
 * */

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