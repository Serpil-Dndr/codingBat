package warmUp_1;

public class EveryNth {
    public static void main(String[] args) {

        everyNth("abcdefg", 2);

    }

    public static void everyNth(String str, int n) {


        if (n >= 1) {
            for (int i = 0; i < str.length(); i=i+n) {


                try {
                    System.out.print(str.charAt(i * n) + " ");
                } catch (Exception e) {
                    System.out.println();
                }

            }
        }
    }
}