package Lv1;

public class Speak {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};
        for (String aa : babbling) {
            for (String bb : words) {
                System.out.println(aa.indexOf(bb));
//                aa.indexOf(bb)+bb.length();

            }
        }
        /*
        문자열 포함 여부
         - contains : 대소문자 구분, true/false
         - indexOf() : 문자열의 위치 return
         - matches() : 정규식과 일치하는 부분이 있는지 체크 , "(.*)string(.*)"
        * */
        return answer;
    }

    // 결과 테스트
    public static void main(String[] args) {
        Speak a = new Speak();


        String[] babbling = {"ayayeaya", "uuuma", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(a.solution(babbling));

    }
}
