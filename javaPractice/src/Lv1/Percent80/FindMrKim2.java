package Lv1.Percent80;

public class FindMrKim2 {
    public String solution(String[] seoul) {

        int i = 0;
        while (i<seoul.length) {
            if (seoul[i] == "Kim"){
                break;
            }else i++;
        }
        return "김서방은 "+i+"에 있다";

    }

    // 결과 테스트
    public static void main(String[] args) {
        FindMrKim2 sol = new FindMrKim2();
        String[] seoul = {"Jane", "dd", "gg", "Kim", "gg", "cc"};

        System.out.println(sol.solution(seoul));

    }
}
