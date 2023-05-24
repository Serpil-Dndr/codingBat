package warmUp_1;

public class MixStart {
    public static void main(String[] args) {
        /*Return true if the given string
        begins with "mix", except the 'm' can be
        anything, so "pix", "9ix" .. all count.
        mixStart("mix snacks") → true
        mixStart("pix snacks") → true
        mixStart("piz snacks") → false

         */
        System.out.println(mixStart("tix snacks"));

    }
    public static boolean mixStart(String str) {
//        if(str.length()<3){
//            return false;
//        }
        String lastTwo = str.substring(1,3);
        if (lastTwo.equals("ix")){
            return true;
        }
        return false;
    }

}
