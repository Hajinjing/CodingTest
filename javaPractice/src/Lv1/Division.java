package Lv1;

public class Division {
    public int solution(int n) {
        int answer = 0;
        for (int i=1; i<n; i++){
            if (n%i==1){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public int solution2(int n) {
        int answer = 1;

        while(true) {
            if (n%answer==1) break;
            answer++;
        }

        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Division a = new Division();

        System.out.println(a.solution(10));

    }
}
