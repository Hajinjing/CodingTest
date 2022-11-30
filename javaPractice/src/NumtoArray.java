import java.util.Arrays;

public class NumtoArray {
    public int[] solution(long n) {
        String ss = n+"";
        int[] answer = new int[ss.length()];
        int cnt = 0;
        while (n>0){
            answer[cnt] = (int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
        return answer;


    }

    public static void main(String[] args) {
        NumtoArray answer = new NumtoArray();
        System.out.println(answer.solution(12345));
    }
}
