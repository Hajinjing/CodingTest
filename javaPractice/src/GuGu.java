public class GuGu {
    public void dan(int n) {
        System.out.println(n*1);
        System.out.println(n*2);
        System.out.println(n*3);
        System.out.println(n*4);
        System.out.println(n*5);
        System.out.println(n*6);
        System.out.println(n*7);
        System.out.println(n*8);
        System.out.println(n*9);
    }
    public static void main(String[] args) {
        GuGu gugu = new GuGu();

        //gugu 객체를 통해 dan메소드를 호출
        gugu.dan(2);

    }
}
