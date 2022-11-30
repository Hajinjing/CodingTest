package Lv1.Percent70;

// 최대한 많은 수를 더해야한다...
// 작은 수 부터? 소인수분해..?
// 포문을 돌면서 마이너스를 하기에는
// {2,2,3,3} , 10  -> 4

// 전에 문제랑 비슷함 등차수열의 합을 빼주면 되긴하다.. 하지만 식이 기억이 안나는걸
// 숫자의 범위때문에 long을 사용하지 않으면 테스트코드에서 틀림

public class Everland {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum = 0;

//        long answer = money;   //이렇게 해주면 범위 문제를 해결할 수 있는듯

        for (int i = 1; i <= count; i++) {
            sum += price*i;
        }
        answer = money-sum;

        return answer <0 ? -answer : 0;
    }


    // 결과 테스트
    public static void main(String[] args) {
        Everland sol = new Everland();

        System.out.println(sol.solution(3, 20, 4));

    }
}
