package Lv1.Percent80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CenterWords {
    public String solution(String s) {
        String answer = "";
        int num = s.length()/2;
        answer += s.length()%2==0 ? ""+s.charAt(num-1)+s.charAt(num) : s.charAt(num);
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        CenterWords sol = new CenterWords();

        System.out.println(sol.solution("qwer"));

    }
}
