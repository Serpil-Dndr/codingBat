package codingBat_Practice;

public class StringE {
    public static void main(String[] args) {
/*
Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false

 */
        System.out.println(stringE("hello"));
        System.out.println(stringE("helleo"));

    }

    public static boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;



        }


        if (count >= 1 && count <= 3){
            System.out.println("E harfi string icinde"+ " "+ count + "icerir");
            return true;
        }

        return false;
    }
}
