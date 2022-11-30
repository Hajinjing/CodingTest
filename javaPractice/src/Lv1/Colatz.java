package Lv1;

public class Colatz {
    public int solution(int num) {
        int answer = 0;
        while (num != 1 && answer != 500 && num<8000000){
            if (num%2 == 0) {
                num = num / 2;
            }
            else {
                num = num * 3 + 1;
                if (num >= 8000000) answer = -1;
                break;
            }
            answer++;
        }
        return num == 1 ? answer:-1;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Colatz sol = new Colatz();

        System.out.println(sol.solution(8888));

    }
}
