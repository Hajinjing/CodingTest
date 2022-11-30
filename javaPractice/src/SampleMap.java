import java.util.HashMap;

public class SampleMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // 제네릭스 사용 , 타입을 미리 선언
        map.put("people","사람");
        map.put("animal","동물");

        System.out.println(map.get("people")); // 사람
        System.out.println(map.get("java")); // null
        System.out.println(map.getOrDefault("java","자바")); // key가 없을 경우 디폴트 값을 지정해주는 방식

        System.out.println(map.containsKey("people")); // true
        System.out.println(map.remove("animal")); // "동물"을 출력

        System.out.println(map.size()); // 1

        System.out.println(map.keySet()); // Map의 모든 Key를 모아서 Set 자료형으로 리턴 , 동물이 삭제됐으니까 [people] 출력



    }
}
