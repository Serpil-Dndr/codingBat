package Interview_Questions_Study;

public class Pattern_Empty {
    public static void main(String[] args) {


        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (rows - i + 1); k++) {
                if (k == 1 || k == (rows - i + 1)) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }
    }
}