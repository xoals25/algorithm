import java.util.Scanner;

/**
 * 풀이 과정
 * 1.주어진 알파벳으로 이루어진 문자열을 한문자 한문자 씩 나눈다.
 * 2.한문자씩 숫자로 변환(아스키코드로 변환)
 * 3.변환된 아스키코드에서 원하는 답에 맞게 계산해주고 출력
 * */

/**
 * 새로 알게된 내장 함수
 * .toCharArray();
 * 문자열을 각각 문자로 나눠 문자 배열(char[])로 넣어준다.
 *
 * char[] charList = A.toCharArray();
 * */

/**
 * 알면 좋을것 같은 사실들
 *  char[] input =  A.trim().toCharArray();
 *  trim() : 문자열의 앞,뒤 공백 제거
 *  toCharArray() : 문장을 새로운 문자 배열로 변환
 * */

/**
 * 같은 방식으로 Stirng[]을 만들어줘서 A.split("")해줘서 해줘도 괜찮을것같다.
 * */

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        char[] charList = A.toCharArray();
        for(int i=0; i<charList.length; i++){
            System.out.print((int) charList[i]-64 +" ");
        }
    }
}