public class Practice2 {
    // Q2
//    public static void main(String[] args) {
//        int result = 0;
//        int i = 1;
//        while (i <= 1000) {
//            if (i % 3 == 0) {
//                result += i;
//            }
//            i += 1;
//        }
//        System.out.println(result);
//    }

    // Q3
//    public static void main(String[] args) {
//        for (int i = 0; i < 6; i++) {
//            System.out.println("*".repeat(i));
//
//        }
//    }

    // Q4
//    public static void main(String[] args) {
//        for (int i = 1; i <= 100 ; i++) {
//            System.out.println(i);
//
//        }
//    }

    //Q5
    public static void main(String[] args) {
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark: marks) {
            total = total + mark;
        }
        float avg  = (float) total / marks.length;
        System.out.println(avg);

    }
}
