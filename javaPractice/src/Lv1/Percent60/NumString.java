package Lv1.Percent60;


import java.util.ArrayList;

// map으로 짝지어서 indexOf
public class NumString {
    public int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numbers.length; i++) {
            if(s.indexOf(numbers[i]) > - 1){
                s = s.replace(numbers[i], "" + i);  //Integer.toString(i) 이렇게 문자로 변환
            }

            // 조건식 없이 replaceAll을 사용하면 된다
//            s = s.replaceAll(numbers[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }

    //
    //

    // 결과 테스트
    public static void main(String[] args) {
        NumString sol = new NumString();

        System.out.println(sol.solution("2three45sixseven"));

    }
}
