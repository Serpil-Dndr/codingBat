package warmUp_1;

public class Max1020 {
    public static void main(String[] args) {
        /*
        Given 2 positive int values,
         return the larger value that is in the range 10..20
         inclusive, or return 0 if neither is in that range.
max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

range in disinda numara type edildiginde ne olacak
         */
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(1, 4));
    }

    public static int max1020(int a, int b) {
        if (a >= 10 && a <= 20 && b >= 10 && b <= 20) {
            if (a < b) {
                return b;
            }
            if (b < a) {
                return a;



            }

        }


        return 0;
    }
}