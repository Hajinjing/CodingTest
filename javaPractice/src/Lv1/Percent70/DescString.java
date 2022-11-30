package Lv1.Percent70;

import java.util.Arrays;
import java.util.Collections;

// 정렬을 하게 되면 대문자가 소문자보다 작은 값을 가지게 됨
// Arrays.sort() 는 char[] 배열은 정렬을 못해주나?  역순 정렬은 StringBuilder로 가능
// 문자를 바로 toCharArray로

public class DescString {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        return String.join("", arr);
    }

    public String solution2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();

    }

    // 결과 테스트
    public static void main(String[] args) {
        DescString sol = new DescString();

        System.out.println(sol.solution2("Zbcdefg"));

    }
}
