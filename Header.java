public class Header {
    static void header() {
        int decoration = 50;
        for (int i = 0; i <= decoration; i++) {
            System.out.print(i == decoration ? "=\n" : "=");
        }
    }
}
