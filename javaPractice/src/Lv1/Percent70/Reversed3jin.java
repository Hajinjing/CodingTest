package Lv1.Percent70;

// n을 3진법 상에서 앞뒤로 뒤집고
// dlfmf ektl 10진법으로 표현해서 return
// 45(10진법) -> 1200(3진법) -> 0021(뒤집고) -> 7(10진법)

import java.util.ArrayList;

public class Reversed3jin {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3); // 10진법으로 변환
    }

    public int solution2(int n) {
        int answer = 0;
        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }

    // 결과 테스트
    public static void main(String[] args) {
        Reversed3jin sol = new Reversed3jin();

        System.out.println(sol.solution(125));

    }
}
