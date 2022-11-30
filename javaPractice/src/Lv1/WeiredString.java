package Lv1;

public class WeiredString {
    public String weired(String s){
        String answer = "";
        StringBuilder s1 = new StringBuilder(s);
        String[] ss = s1.toString().split(" ", -1); //비어있는 값 인식
        for (String el:ss
             ) {
            System.out.println(el);
            for (int i = 0; i < el.length(); i++) {
                char a = el.charAt(i);
                if (i % 2 == 0) {
                    answer += Character.toUpperCase(a);
                } else {
                    answer += Character.toLowerCase(a);
                }
            }
        } return answer;
    }

    public static void main(String[] args) {
        WeiredString result = new WeiredString();
        System.out.println(result.weired(" hi your    father"));
    }
}
