package warmUp_1;

public class HasTeen {
    public static void main(String[] args) {
/*

We'll say that a number is
 "teen" if it is in the range 13..19 inclusive.
  Given 3 int values, return true if 1 or more of them are teen.
hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
        System.out.println(hasTeen(34,22,24));
    }
    public  static boolean hasTeen(int a, int b, int c) {
         if(13<=a && a<=19 ||
            13<=b && b<=19 ||
                    13<=c && c<=19 ){
             return true ;
        }
         return false;
    }

}
