import java.util.Scanner;
import java.io.FileInputStream;


/*
*
* 풀이1
*
* 메모리 : 25,576 kb
* 실행시간 : 125 ms
*
* */
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int result=1;
        for(int test_case = 0; test_case <=T; test_case++)
        {
            System.out.print(result+" ");
            result = result * 2;
        }
    }
}


/*
*
* 풀이2
*
* 메모리 : 25,124 kb
* 실행시간 : 123 ms
* */
class Solution{
    public static void main(String args[]) throws Exception{

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<=T; i++) {
            int temp = (int) Math.pow(2, i);
            System.out.print(temp+" ");
        }

    }
}