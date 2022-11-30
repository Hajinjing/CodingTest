package Lv1;

public class FoodFight {
    public String solution(int[] food) {
        String answer = "";
        for (int i=1; i<food.length; i++){
            //짝수
            String s = ""+i;
            if (food[i]%2==0) {
                s = s.repeat(food[i]/2);
            }else {
                s = s.repeat((food[i]-1)/2);
            }
                answer += s;
        }
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        answer = answer + 0 + reverse;
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        FoodFight a = new FoodFight();
        int[] foods = {1,3,4,6};


        // 예를들어 foods[1] = 3 이네? 홀수인 경우 무조건 1을 빼고    1개를 시켰으면 그 음식은 뺌, 그 이상은 1을 빼고 2로 나눠서 배분?

        System.out.println(a.solution(foods));

    }
}
