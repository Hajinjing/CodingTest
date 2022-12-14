package Lv1;

public class DotProduct {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        DotProduct sol = new DotProduct();
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(sol.solution(a,b));

    }
}
