package Lv1.Percent70;

// 최대한 많은 수를 더해야한다...
// 작은 수 부터? 소인수분해..?
// 포문을 돌면서 마이너스를 하기에는
// {2,2,3,3} , 10  -> 4

import java.util.Scanner;

public class SquareStar {
    public int solution(int[] d, int budget) {
        int answer = 0;
        return answer;
    }


    // 결과 테스트
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        for (int i = 0; i < b; i++) {
            System.out.println("*".repeat(a));
        }
    }
}
