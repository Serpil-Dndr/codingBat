package warmUp_1;

public class DelDel {
    public static void main(String[] args) {
        /*
        Given a string, if the string "del" appears starting at index 1,
        return a string where that "del" has been deleted.
        Otherwise, return the string unchanged.
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
         */
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }
    public static String delDel(String str) {
        String newStr ="";
        if(str.length()>=3 && str.substring(1,4).equals("del")){
            return str.substring(0,1)+ str.substring(4);


        }
        return str;
    }

}
