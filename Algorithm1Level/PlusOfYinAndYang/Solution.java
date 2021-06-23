/**
 * 풀이
 *
 * 다음의 과정을 통해 문제를 해결
 * 1. true이면 더해주고 false면 빼준다.
 *
 * */

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]==true)
                answer = answer + absolutes[i];
            else
                answer = answer - absolutes[i];
        }
        return answer;
    }
}