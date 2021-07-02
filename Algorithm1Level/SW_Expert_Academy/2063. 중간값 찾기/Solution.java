import java.util.Scanner;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * 최종 결과
 *
 * int[]로 하면 실행시간이 조금이나마 감축
 * ArrayList로 하면 메모리가 절약
 *
 * */

/*
*int 배열 내림차순하여 출력
* 메모리 30,980kb  실행시간 128ms 나름 빠르다.
* */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int[] scoreList = new int[T];

        for(int i=0; i<T; i++){
            scoreList[i] = sc.nextInt();
        }
        //내림차순
        reverseInt(scoreList);
        T = T/2 ;
        System.out.println(scoreList[T]); //0부터 인덱스가 시작이니까 T = T/2 +1 이 아니라 T/2가 되는 것이다.
    }

    public static void reverseInt(int[] intList){
        Arrays.sort(intList);
        for(int i=0; i<intList.length/2; i++){
            int temp = intList[i];
            intList[i] = intList[intList.length - i - 1];
            intList[intList.length - i - 1] = temp;
        }
    }

}

/*
* int배열 오름차순으로 해결
* 메모리 : 30,180kb , 실행시간 : 129ms
* */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int[] scoreList = new int[T];

        for(int i=0; i<T; i++){
            scoreList[i] = sc.nextInt();
        }
        //오름차순
        Arrays.sort(scoreList);
        T = T/2 ;
        System.out.println(scoreList[T]); //0부터 인덱스가 시작이니까 T = T/2 +1 이 아니라 T/2가 되는 것이다.

    }
}

/*
* ArrayList 내림차순 정렬로 해결
*
* 메모리 : 28,828kb , 실행시간 : 134ms
*
* */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();

        ArrayList<Integer> scoreList = new ArrayList<>();
        for(int i=0; i<T; i++){
            scoreList.add(sc.nextInt());
        }
        //오름차순은 단지 .sort(scoreList);로 해주면된다.
        //내림차순이다.  -> 근데 사실 중앙에 있는 수를 가져오는거라 내림차순이든 오름차순이든 상관없다? 근데 수가 중복되면 꼬일텐데? 내림차순을 하는게 맞는것 같다.
        Collections.sort(scoreList,Collections.reverseOrder());

        T = T/2 ;

        System.out.println(scoreList.get(T)); //0부터 인덱스가 시작이니까 T = T/2 +1 이 아니라 T/2가 되는 것이다.

    }
}
/*
* ArrayList 오름차순으로 해결
*
*메모리 : 26,880kb , 실행시간 133ms
*
* */
class Solution
{
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        ArrayList<Integer> scoreList = new ArrayList<>();

        for(int i=0; i<T; i++){
            scoreList.add(sc.nextInt());
        }
        //오름차순
        Collections.sort(scoreList);
        T = T/2 ;
        System.out.println(scoreList.get(T)); //0부터 인덱스가 시작이니까 T = T/2 +1 이 아니라 T/2가 되는 것이다.
    }

}