import java.util.Scanner;

//내코드
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>B) System.out.println("#"+test_case+" >");
            else if(A<B) System.out.println("#"+test_case+" <");
            else System.out.println("#"+test_case+" =");
        }
    }
}
//다른 사람 코드 -> 코드가 간략해서 가져왔다.
import java.util.Scanner;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for(int i =0  ;i  < cnt ; i ++){
            int a = sc.nextInt(), b= sc.nextInt();
            System.out.printf("#%d %c\n", i+1, a < b ? '<' : a > b ? '>' : '=');
        }
    }
}
