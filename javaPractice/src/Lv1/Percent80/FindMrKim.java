package Lv1.Percent80;

public class FindMrKim {
    public String solution(String[] seoul) {
        String answer = "";
        for (int i = 0; i < seoul.length; i++) {
                System.out.println(i);
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 "+i+"에 있다";
                break;
            }

        }

        return answer;

    }

    // 결과 테스트
    public static void main(String[] args) {
        FindMrKim sol = new FindMrKim();
        String[] seoul = {"Jane", "dd", "gg", "Kim", "gg", "cc"};

        System.out.println(sol.solution(seoul));

    }
}
