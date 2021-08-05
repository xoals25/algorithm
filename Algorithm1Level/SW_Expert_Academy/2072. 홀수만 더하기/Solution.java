import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 1. 조건문으로 홀수만 필터해주기
 * 2. 나온 홀수 더해주기
 *
 * 끝.
 * 오늘의 알고리즘 두문제 풀이 끝.
 * */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int B;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum =0;
            for(int i = 0; i < 10; i++){
                B = sc.nextInt();
                if ( B % 2 != 0) sum = sum + B;
            }
            System.out.println("#" + test_case + " " + sum);
        }
    }
}