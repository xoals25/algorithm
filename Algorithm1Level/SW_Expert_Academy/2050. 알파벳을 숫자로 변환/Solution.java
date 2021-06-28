import java.util.Scanner;

/**
 * 풀이 과정
 * 1. 유효성 검사 하기 위한 정보 나열
 * 2. 주어진 문자열을 요효성 검사하기 위해 잘라 놓기
 * 3. 유효성 검사후 출력
 * */

/**
 * 새로 알게된 내장 함수
 * .substring(0,4); //0부터 4전까지 자르기 즉, 0123 (문자의 인덱스)이 나온다.
 * .sutstring(6); //6번의 인덱수부터 끝까지 자른다.
 * */




import java.util.Scanner;


class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        sc.nextLine();
        int[] monthDay = {31,28,31,30,31,30,31,31,30,31,30,31};

        for(int i=1; i<=T; i++){
            String date = sc.nextLine();

            String year = date.substring(0,4); //0부터 4전까지 자르기 즉, 0123이 나온다.
            String month =date.substring(4,6);
            String day =date.substring(6);

            int monthToInt = Integer.parseInt(month);
            int dayToInt = Integer.parseInt(day);
            if(0<monthToInt && monthToInt <13 && 0<dayToInt && dayToInt <=monthDay[monthToInt-1]){
                System.out.println("#"+i+" "+year+"/"+month+"/"+day);
            }
            else{
                System.out.println("#"+i+" -1");
            }
        }

    }
}