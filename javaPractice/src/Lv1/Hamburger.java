package Lv1;

public class Hamburger {
    public int solution(int[] ingredient) {
        int answer = 0;
        int[] temp = new int[]{};
        // 1,2,3 이 연달아 있어야한다   길이는 8,
        for (int i=0; i<ingredient.length-2; i++) {
                System.out.println("i : "+i);
            if (ingredient[i] == 1 && ingredient[i+1] == 2 && ingredient[i+2] == 3){
                System.out.println("if문 진입");
                System.out.println("i : "+i);
                answer += 1;
                i += 3;
                System.out.println("i : "+i);
                continue;
            }
        }
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Hamburger a = new Hamburger();
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3}; //2개가 나와야함


        System.out.println(a.solution(ingredient));

    }
}
