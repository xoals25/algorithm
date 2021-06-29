import java.util.Scanner;

/**
 * 풀이 과정
 * 1. 자릿수를 나눈다. -> T%10 해줘서 나머지 값으로 마지막 자릿수의 숫자를 빼온다. ex) 123%10 = 3
 * 2. 나눈 자릿수를 더한다. -> 빼온 숫자를 더해준다.
 * 3. 더한 자릿수의 숫자를 입력받은 자연수에서 제외 시켜준다. -> T=T/10 을 해준다. ex)123/10 = 12;
 * */

/**
 *
 *  26,960kb 메모리 129ms 실행시간 (몫, 나머지 나눗셈으로 숫자 나눠서 구하기)
 *  26,344kb 메모리 124ms 실행시간 (int -> String -> charAt(i)로 구하기 (아스키코드 처리 o ) )
 *  26,996kb 메모리 120ms 실행시간 (int -> String -> charAt(i)로 구하기 (Character.getNumericValue(tToString.charAt(i)); 사용) )
 *  37,764kb 메모리 193ms 실행시간 (String으로 변환후 split해주고 mapToInt로 map 형태로 변환시켜준후 toArray()로 배열화해주기 구하기)
 *
 * */

//몫,나머지 나눗셈으로 숫자 나눠서 구하기

/*26,960kb 메모리 129ms 실행시간*/

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        boolean B = true;
        int result = 0;
        while(B){
            result = result + (T%10);
            T = T/10;
            if(T==0){
                System.out.println(result);
                break;
            }
        }

    }
}

import java.util.Scanner;

//아스키코드 0 = 48번, 1 = 49번, 2 = 50번, 3 = 51번, 4 = 52번, 5 = 53번, 6 = 54번, 7 = 55번, 8 = 56번, 9 = 57번

//int -> String -> chatAt(i)으로 문자열을 받아옴 -> 받아온 문자열에 -'0'을 해주워 아스키코드값 제외시키기
//문자열에 -'0'을 해주는 이유

//숫자가 문자로 되어있는 경우 즉, String AtoString ="6" or Char AtoChar = '6'일 경우에
// String 타입인 AtoString은 숫자로 변환해주면 6으로 출력되지만
// char 타입인 AtoChar은 숫자로 변환해주면 아스키코드로 변환된다.

//String 타입은 int타입인 변수와 더해주면 숫자로 변환되서 더해지는게 아니라 문자열로 나오게된다.
//char 타입은 int타입인 변수와 더해주면 아스키코드로 변환되어서 숫자로 더해진다.

//즉 int B = 10;
// B + AtoChar = 10 + 54가되어 16이 아니라 64가 나오게된다.
// 그래서 -'0'을 해줘서 숫자를 맞춰주는 것이다.
// B + (AtoChar-'0')  = 10 + (54-48) = 16이 나오는 것이다.

/*26,344kb 메모리 124ms실행시간*/

class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        String tToString = String.valueOf(T);
        T  = 0;
        for(int i=0; i<tToString.length(); i++){
            //char - '0'을 이용하면 아스키코드값을 알 필요없이 int형으로 변환 가능
            // Character.getNumericValue(input.charAt(i)) 방법을 이용해도 형변환이 가능하다.
            T += (tToString.charAt(i)-'0');

        }
        System.out.println(T);
    }
}

/*26,996kb 메모리 120ms 실행시간*/
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        String tToString = String.valueOf(T);
        T  = 0;
        for(int i=0; i<tToString.length(); i++){
            T += Character.getNumericValue(tToString.charAt(i));
        }
        System.out.println(T);
    }
}


/*37,764kb 메모리 193ms 실행시간*/
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Stream;
//String으로 변환후 split해주고 mapToInt로 map 형태로 변환시켜준후 toArray()로 배열화해주기
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int[] tList = Stream.of(String.valueOf(T).split("")).mapToInt(Integer::parseInt).toArray();
        T = 0;
        for(int i=0; i<tList.length; i++){
            T = T + tList[i];
        }
        System.out.println(T);
    }
}