package Lv1.Percent80;

public class Watermelon {
    public String solution(int n) {
        String answer = "";
        for (int i=0; i<n; i++){
//            if (i%2==0) {
//                answer += "수";
//            }else answer += "박";
            answer += i%2==0? "수" : "박";
//            i%2 == 0 ? answer += "수" : answer += "박";
        }
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Watermelon sol = new Watermelon();

        System.out.println(sol.solution(5));

    }
}
