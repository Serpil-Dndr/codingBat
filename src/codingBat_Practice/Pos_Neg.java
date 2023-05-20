package codingBat_Practice;

public class Pos_Neg {
    public static void main(String[] args) {
        /*
        Given 2 int values, return true if one is negative
        and one is positive. Except if the parameter
         "negative" is true, then return true only if both are negative.
posNeg(1, -1, false) → true
posNeg(-1, 1, false) → true
posNeg(-4, -5, true) → true

         */
        System.out.println(posNeg(1,-1,false));
        System.out.println(posNeg(-1,1,false));
        System.out.println(posNeg(-1,-1,true));
    }
    public static boolean posNeg(int a, int b, boolean negative) {
             if(a>0 && b<0 || a<0 && b>0 ){
                 return true;
             }
             if(negative &&  (a < 0 && b < 0)){
              return true;
             }
             return false;
    }

}
