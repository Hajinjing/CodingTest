public class AddNum {
    public int addNum(int n){
        int answer = 0;
        String StringNum = ""+n;
        StringBuilder ss  = new StringBuilder(StringNum);
        String[] sa= ss.toString().split("");
        for (String el:sa
             ) {answer += Integer.parseInt(el);
            
        }
        



        return answer;

    }

    public static void main(String[] args) {
        AddNum result = new AddNum();
        System.out.println(result.addNum(123));
    }
}
