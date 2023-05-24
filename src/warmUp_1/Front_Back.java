package warmUp_1;

public class Front_Back {
    public static void main(String[] args) {
           /*
           Given a string, return a new string
           where the first and last chars have been exchanged.
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"

            */
        System.out.println(frontBack("serpil"));

    }
//not complete
    public static  String frontBack(String str) {

        if (str.length() == 1 || str.length() == 0)
            return str;

        String mid = str.substring(1, str.length()-1);

        // last + mid + first
        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }}

