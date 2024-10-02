public class Main {
    public static void main(String[] args) {

        for (int space = 1; space <= 13 - 1; space++) {
            System.out.print(" ");
        }
        System.out.println("⭐");

        for (int layer = 1; layer <= 5; layer++) {
            for (int y = 1; y <= 10 - layer + 2; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (4 + 2 * (layer - 1)); y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int layer = 1; layer <= 3; layer++) {
            for (int y = 1; y <= 9 - layer + 1; y++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * (layer + 3)); y++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = 1; a <= 2; a++) {
            for (int b = 1; b <= 10 + 1; b++) {
                System.out.print(" ");
            }
            System.out.println("****");
        }

        System.out.println();
        System.out.println("=========================");
        System.out.println("     Merry Christmas!!");
        System.out.println("=========================");
    }
}
