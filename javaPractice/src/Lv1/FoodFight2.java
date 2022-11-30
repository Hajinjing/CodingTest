package Lv1;

public class FoodFight2 {
    public String solution(int[] food) {
        String answer = "0";

        // 0을 기준으로 양쪽으로 붙여준다..?
        // 가장 마지막 인덱스가 가운데에 있어야하니까 0을 기준으로 양 옆으로 붙여줘야함 .. 오 이런생각.. 쩌네
        for (int i = food.length-1; i>0; i--){
            // 홀수 짝수 나눌필요도 없어,, 나누기를 하면 정수만 반환되니까
            for (int j=0; j<food[i]/2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        FoodFight2 a = new FoodFight2();
        int[] foods = {1,3,4,6};


        // 예를들어 foods[1] = 3 이네? 홀수인 경우 무조건 1을 빼고    1개를 시켰으면 그 음식은 뺌, 그 이상은 1을 빼고 2로 나눠서 배분?

        System.out.println(a.solution(foods));

    }
}
