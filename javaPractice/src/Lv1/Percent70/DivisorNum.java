package Lv1.Percent70;

//

public class DivisorNum {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <=right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j == 0) count++;
            }
            answer += count%2 == 0? i:-i;
        }
        return answer;
    }

    public int solution2(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }


    // 결과 테스트
    public static void main(String[] args) {
        DivisorNum sol = new DivisorNum();

        System.out.println(sol.solution(13, 17));

    }
}
