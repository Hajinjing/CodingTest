package Lv1;

import java.util.Arrays;
import java.util.Collections;


public class Fruit {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        if (score.length < m) {
            return 0;
        }

        Integer[] arr2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        int boxNum = score.length%m;
        // m이 3이라고 가정한다면 값은 arr2[2]*3, arr2[5]*3  이런식으로 되야하는데
        for (int i=0; i<arr2.length-boxNum;) {
            System.out.println("arr값 : "+arr2[i+m-1]); //arr[2]
            answer += arr2[i+m-1]*m;
            System.out.println("답 : "+answer);
            i += m; // i = 3
            System.out.println("i값 : "+i);
        }

        return answer; // 33
    }
    public static void main(String[] args) {
        Fruit a = new Fruit();
        int[] score = {1, 2, 3, 1, 2, 3, 1};


        System.out.println(a.solution(3,4,score));

    }
}

// 그럼 제일 큰 값으로 일단 한 상자를 만드는게    그니까? m개면 큰 순서대로 했을때 m만큼 잘라 걔가 한 상자가 되는게 가장 큰 값이 됨...