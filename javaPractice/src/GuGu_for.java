public class GuGu_for {
    public void dan(int n) {
        for (int i = 1; i < 10; i++) {
            System.out.println(n*i);

        }
    }

    public static void main(String[] args) {
        GuGu_for gugu = new GuGu_for();
        for (int i = 2; i < 10; i++) {
            gugu.dan(i);


        }
    }
}
