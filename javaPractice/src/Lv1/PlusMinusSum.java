package Lv1;

public class PlusMinusSum {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int i = 0;
        for (int num : absolutes) {
            boolean sign = signs[i];
            if (sign == false) num *= -1;
            answer += num;
            i += 1;
        }


        return answer;
    }

    public int solution2(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += absolutes[i] * (signs[i]? 1: -1);
        }
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        PlusMinusSum a = new PlusMinusSum();
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(a.solution(absolutes, signs));

    }
}
