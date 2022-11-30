package Lv1.Percent80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Divisor {
    public List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();

        for (int num:arr
             ) {
            if (num%divisor == 0) {
                answer.add(num);
                answer.sort(Comparator.naturalOrder());

            }

        }
        if (answer.size()==0) answer.add(-1);

        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Divisor sol = new Divisor();
        int[] arr = {3, 2, 6};


        System.out.println(sol.solution(arr, 10));

    }
}
