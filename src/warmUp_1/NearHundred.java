package warmUp_1;

public class NearHundred {
    public static void main(String[] args) {
        System.out.println(nearHundred(189));
    }

    public static boolean nearHundred(int n) {

        if ((100 - n)<=10 && (200-n) <=10 ) {

            return true;
        }

        return false;
    }


}
