import java.util.Arrays;

public class SortNum {
    public long sortNum(long n) {
        String num = n+"";
        char[] StringtoChar = num.toCharArray();
        System.out.println(StringtoChar.getClass());
        Arrays.sort(StringtoChar);
//        String SortedString = new String(StringtoChar);


//        System.out.println(num.charAt(2)>num.charAt(3));
//        System.out.println(SortedString);
        String answer = new StringBuilder(new String(StringtoChar)).reverse().toString();

        return Long.parseLong(answer);


    }

    public static void main(String[] args) {
        SortNum answer = new SortNum();
        System.out.println(answer.sortNum(46385749));
    }
}
