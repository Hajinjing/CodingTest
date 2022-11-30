import java.util.Arrays;
import java.util.HashSet;

// 중복을 허용하지 않음
// 순서가 없음
// 자료형의 중복을 제거하기 위한 필터로 종종 사용
// TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
// LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.

public class SetSample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));
        System.out.println(set); // [e, H, l, o] 출력
    }
}
