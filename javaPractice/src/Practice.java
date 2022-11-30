import java.util.*;

public class Practice {
    // Q6
//    public static void main(String[] args) {
//        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
//        myList.sort(Comparator.reverseOrder()); // 역순 정렬
//        System.out.println(myList);
//    }

    // Q7
//    public static void main(String[] args) {
//        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life","is","too","short"));
//        System.out.println(String.join(" ", myList));
//    }

    // Q8
//    public static void main(String[] args) {
//        HashMap<String, Integer> grade = new HashMap<>();
//        grade.put("A", 90);
//        grade.put("B", 80);
//        grade.put("C", 70);
//
//        System.out.println(grade.remove("B"));
//        System.out.println(grade);
//
//    }

//    // Q9
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,3,3,4,4,5));
//        HashSet<Integer> numbers2 = new HashSet<>(numbers); // List를 Set으로 변경
//        ArrayList<Integer> result = new ArrayList<>(numbers2) // Set을 다시 List로 변경
//        System.out.println(result);
//
//    }

    // Q10

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };


    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));

    }



    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);
    }
}
