package Lv1.Percent60;

// 최대한 많은 수를 더해야한다...
// 작은 수 부터? 소인수분해..?
// 포문을 돌면서 마이너스를 하기에는
// {2,2,3,3} , 10  -> 4

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinRectangle {
    public int solution(int[][] sizes) {
        List<Arrays> ss = new ArrayList<>();
        int answer = 0;
        return answer;
    }

    // 배열에서 하나를 꺼내서 그 중 큰 값을 a, 작은 값을 b
    // 다음 max가 a 보다 크다면 대
    //
    //

    // 결과 테스트
    public static void main(String[] args) {
        MinRectangle sol = new MinRectangle();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        System.out.println(sol.solution(sizes));

    }
}
