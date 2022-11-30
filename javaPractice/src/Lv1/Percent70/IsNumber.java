package Lv1.Percent70;

import java.util.ArrayList;
import java.util.List;

public class IsNumber {
    public boolean solution(String s) {
        return (s.length()==4 || s.length() == 6) && s.matches("^[0-9]*$") ? true: false;
    }

    // 결과 테스트
    public static void main(String[] args) {
        IsNumber sol = new IsNumber();

        System.out.println(sol.solution("1234"));

    }
}
