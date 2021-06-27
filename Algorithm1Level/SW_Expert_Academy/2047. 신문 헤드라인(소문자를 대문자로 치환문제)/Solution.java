import java.util.Scanner;

/**
 *
 * .toUpperCase(); 소문자 -> 대문자 치환.
 * .toLowerCase(); 대문자 -> 소문자 치환
 *
 * 자바는 영문자를 서로 비교할 때(equals), 대/소문자가 다르다면 false 가 리턴된다.
 * 만약 대소문자 상관없이 두 문자열을 비교하고 싶다면
 * toLowerCase()와 toUpperCase() 메소드를 활용하여 비교대상의 두 문자열을 대문자 혹은 소문자로 통일 시켜준 뒤 비교하자자 *
 * 혹은 equalsIgnoreCase( )를 이용 하여 비교할 수 있다.
 *
 * */

class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        String T=sc.nextLine();
        T = T.toUpperCase();//소문자 -> 대문자로 치환.
        System.out.print(T);

    }
}