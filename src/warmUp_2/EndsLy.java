package warmUp_2;

public class EndsLy {
    public static void main(String[] args) {
        /*
        Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
         */
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("oddy"));
    }
    public static boolean endsLy(String str) {
              if(str.length()<2){
            return false;
        }
        return str.substring(str.length() - 2).equals("ly");
    }

}
