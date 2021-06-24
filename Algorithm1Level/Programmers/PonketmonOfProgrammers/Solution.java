/**
 * 풀이
 *
 * 다음의 과정을 통해 문제를 해결
 * 1. 포켓몬의 종류가 몇개인지 확인하기
 * 2. 포켓몬의 종류가 가져 갈 수 있는 포켓몬수의 최대값을 넘기는지 확인하기
 *
 *
 * 중복 체크 방법
 * 1번.주어진 배열을 오름차순으로 변경
 * 2번.Set으로 변경
 * 3번.ArrayList로 변경
 *
 * 효과적인 결과
 * 1번 : 두번째로 결과가 좋았으며, 주어진 수가 적을때 제일 약세를 보였고 수가 많을땐 두번째로 성능이 우수했으며 2번과 큰 차이가 없었음
 * 2번 : 첫번째로 결과가 좋았으며, 주어진 수가 적을때 뛰어난 성능을 보였으며 수가 많을땐 첫번째로 성능이 우수했음
 * 3번 : 세번째로 결과가 좋았으며, 주어진 수가 적을때 뛰어난 성능을 보였지만 수가 많아지면 성능이 현저히 떨어짐.
 * */
import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
/*
테스트 1 〉	통과 (0.48ms, 52.6MB)
테스트 2 〉	통과 (1.12ms, 52MB)
테스트 3 〉	통과 (0.45ms, 52.6MB)
테스트 4 〉	통과 (0.46ms, 52.9MB)
테스트 5 〉	통과 (0.34ms, 51.9MB)
테스트 6 〉	통과 (0.42ms, 52.7MB)
테스트 7 〉	통과 (0.54ms, 52.3MB)
테스트 8 〉	통과 (0.45ms, 53.5MB)
테스트 9 〉	통과 (0.50ms, 51.9MB)
테스트 10 〉	통과 (0.48ms, 52MB)
테스트 11 〉	통과 (0.45ms, 54.1MB)
테스트 12 〉	통과 (0.98ms, 53.2MB)
테스트 13 〉	통과 (0.94ms, 52.6MB)
테스트 14 〉	통과 (1.01ms, 52MB)
테스트 15 〉	통과 (1.41ms, 52.6MB)
테스트 16 〉	통과 (7.00ms, 52.6MB)
테스트 17 〉	통과 (6.67ms, 53.1MB)
테스트 18 〉	통과 (9.98ms, 54.1MB)
테스트 19 〉	통과 (6.56ms, 54MB)
테스트 20 〉	통과 (2.26ms, 53.2MB)
*/
// 포켓몬의 종류가 몇개인지 확인하는 방법을 오름차순을 이용해 해결
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        int firstNum = nums[0];
        int maxNum = nums.length/2;

        for(int i=1; i<nums.length; i++){
            if(firstNum!=nums[i]){
                firstNum = nums[i];
                answer +=1;
            }
            if(maxNum<=answer){
                return maxNum;
            }
        }

        return answer;
    }
}

/*
 * 결과
 * 테스트 1 〉	통과 (0.04ms, 52.3MB)
 * 테스트 2 〉	통과 (0.06ms, 53.1MB)
 * 테스트 3 〉	통과 (0.05ms, 52.6MB)
 * 테스트 4 〉	통과 (0.06ms, 52.3MB)
 * 테스트 5 〉	통과 (0.05ms, 52.9MB)
 * 테스트 6 〉	통과 (0.04ms, 52.6MB)
 * 테스트 7 〉	통과 (0.11ms, 52.5MB)
 * 테스트 8 〉	통과 (0.19ms, 52.7MB)
 * 테스트 9 〉	통과 (0.11ms, 52.8MB)
 * 테스트 10 〉	통과 (0.27ms, 53.8MB)
 * 테스트 11 〉	통과 (0.14ms, 51.8MB)
 * 테스트 12 〉	통과 (0.71ms, 52.5MB)
 * 테스트 13 〉	통과 (2.53ms, 52.8MB)
 * 테스트 14 〉	통과 (0.74ms, 52MB)
 * 테스트 15 〉	통과 (0.90ms, 52.7MB)
 * 테스트 16 〉	통과 (2.60ms, 53.7MB)
 * 테스트 17 〉	통과 (5.04ms, 54.9MB)
 * 테스트 18 〉	통과 (4.83ms, 52.7MB)
 * 테스트 19 〉	통과 (3.21ms, 54.1MB)
 * 테스트 20 〉	통과 (8.53ms, 53.8MB)
 * */
//포켓몬의 종류가 몇개인지 확인하는 방법을 int배열을 HashSet으로 변경해 중복을 제거해 해결
class Solution{
    public int solution(int[] nums){
        //이 때, 중복 제거 ->Set은 중복된 값을 가지지 않는 Collection이기 때문에
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i : nums){
            hashSet.add(i);
        }
        if(hashSet.size()>=nums.length/2){
            return nums.length/2;
        }
        else{
            return hashSet.size();
        }
    }
}

/*
테스트 1 〉	통과 (0.04ms, 52.1MB)
테스트 2 〉	통과 (0.03ms, 52.6MB)
테스트 3 〉	통과 (0.04ms, 52.4MB)
테스트 4 〉	통과 (0.04ms, 53.1MB)
테스트 5 〉	통과 (0.04ms, 53.5MB)
테스트 6 〉	통과 (0.05ms, 54.3MB)
테스트 7 〉	통과 (0.49ms, 51.8MB)
테스트 8 〉	통과 (0.39ms, 52.8MB)
테스트 9 〉	통과 (0.48ms, 52.6MB)
테스트 10 〉	통과 (0.43ms, 51.7MB)
테스트 11 〉	통과 (0.17ms, 51.9MB)
테스트 12 〉	통과 (15.76ms, 52.7MB)
테스트 13 〉	통과 (6.07ms, 53MB)
테스트 14 〉	통과 (7.17ms, 53MB)
테스트 15 〉	통과 (3.00ms, 53.2MB)
테스트 16 〉	통과 (43.64ms, 54.3MB)
테스트 17 〉	통과 (39.60ms, 53.3MB)
테스트 18 〉	통과 (33.34ms, 54MB)
테스트 19 〉	통과 (24.66ms, 53.3MB)
테스트 20 〉	통과 (3.76ms, 52.9MB)
* */

//포켓몬의 종류가 몇개인지 확인하는 방법을 int배열을 ArrayList로 변경해 중복을 제거해 해결
class Solution{
    public int solution(int[] nums){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i : dataList){
            if(!arrayList.contains(i)) {
                arrayList.add(i);
            }
        }

        if(arrayList.size()>=nums.length/2){
            return nums.length/2;
        }
        else{
            return arrayList.size();
        }
    }
}
