import java.util.Scanner;
import java.io.FileInputStream;

/**
 * 다른 사람 코드 보니 수학 계산방식으로 간단하게 만들 수 있다는걸 깨닳았다.
 * */

/*내 코드*/
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int result = 0;
        for(int test_case = 1; test_case <= T; test_case++)
        {
            result = result+test_case;

        }
        System.out.println(result);
    }
}

/*다른 사람 코드 */
class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println(((1+T)*T)/2);
    }
}