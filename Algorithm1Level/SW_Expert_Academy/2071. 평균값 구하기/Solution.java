import java.util.Scanner;


/**
 *
 * 첫 번째 풀이
 * . Math.round() 함수를 이용하여 반올림
 *
 * . 주의점
 * . int/int를 하면 int로 나온다
 * . ex ) 원하는 값 10.5이라 가정, 21/2 = 10이 나온다. 즉 0.5가 생략
 *
 * . 소수점까지 원하는 값을 같고 싶다면, double / double, int / double 해줘야한다 .
 * . ex ) 21.0 / 2.0 = 10.5, 21 / 2.0 = 10.5
 *
 * */
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int A;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            double sum = 0;
            for( int i = 0; i < 10; i++){
                A = sc.nextInt();
                sum =  sum + A;
            }
            sum = sum/10.0;
            System.out.println("#" + test_case + " " + Math.round(sum));
        }
    }
}

/**
 *
 *  두 번째 풀이
 *  ( % )를 이용해 나머지를 구해 조건문으로 반올림 구현
 *
 *  내 생각에는 이 풀이가 더 직관적이고 쉽게 파악 가능하다.
 *  간단히 설명하면 ( % )를 이용해 나머지가 5미만인지 5이상인지 구해서
 *  5미만이면 ( / ) 를 해주고 바로 출력
 *  5이상이면 ( / ) 를 해주고 +1 해줘서 출력
 *
 *  끝! SIMPLE IS BEST!
 *
 */

import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int A;

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum = 0;
            for( int i = 0; i < 10; i++){
                A = sc.nextInt();
                sum =  sum + A;
            }
            if (sum % 10 <= 4) sum = sum / 10;
            else if (sum % 10 >=5) sum = ( sum / 10 ) + 1;
            System.out.println("#" + test_case + " " + sum);
        }
    }
}