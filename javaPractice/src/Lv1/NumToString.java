package Lv1;

public class NumToString {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);

        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        NumToString sol = new NumToString();

        System.out.println(sol.solution("-3333"));

    }
}
