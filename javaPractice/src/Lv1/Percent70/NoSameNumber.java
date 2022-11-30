package Lv1.Percent70;

import java.util.ArrayList;
import java.util.List;

public class NoSameNumber {
    public List<Integer> solution(int []arr) {
        int[] answer = {};
        List<Integer> answer2 = new ArrayList<>();

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]){
                continue;
            }else answer2.add(arr[i]);

        }
        answer2.add(arr[arr.length-1]);

        return answer2;
    }

    // 결과 테스트
    public static void main(String[] args) {
        NoSameNumber sol = new NoSameNumber();
        int[] arr = {1,1,3,3,0,2,1}; //1,3,0,1


        System.out.println(sol.solution(arr));

    }
}
