package warmUp_1;

public class StartHi {
    public static void main(String[] args) {
        System.out.println(startHi("hi"));
        /*
        Given a string, return true
        if the string starts with "hi"
        and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false

         */
    }
    public static boolean startHi(String str) {
//return str.startsWith("hi");
        if(str=="hi"){
            return true;
        }
        return false;
    }


}
