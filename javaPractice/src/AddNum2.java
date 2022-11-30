public class AddNum2 {
    public int addNum(int n){
        int answer = 0;
        while (n>0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;

    }

    public static void main(String[] args) {
        AddNum2 result = new AddNum2();
        System.out.println(result.addNum(1234));
    }
}
