package Lv1;

import java.util.Arrays;

public class NonexistentNum {
    public int solution(int[] numbers) {
        int totalNum = 45;
        // 0-9 까지 다 더하면 55자나..? 그럼 받은 배열의 합을 구헤서 55에서 빼면 될듯
        // 배열의 합은 어떻게 구하나요
        int sumNum = Arrays.stream(numbers).sum();
        System.out.println(sumNum);
        return totalNum-sumNum;
    }
    public int solution2(int[] numbers) {
        int totalNum = 45;
        for (int num:numbers
             ) {
            totalNum -= num;
        }
        return totalNum;
    }

    // 결과 테스트
    public static void main(String[] args) {
        NonexistentNum a = new NonexistentNum();
        int[] numbers = {5,8,4,0,6,7,9};
        System.out.println(a.solution2(numbers));

    }
}
