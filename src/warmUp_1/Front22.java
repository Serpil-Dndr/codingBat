package warmUp_1;

public class Front22 {
    public static void main(String[] args) {
        /*
        Given a string, take the first 2 chars and
        return the string with the 2 chars added at
        both the front and back, so "kitten" yields"kikittenki".
        If the string length is less than 2,
        use whatever chars are there.
front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
         */
        System.out.println(front22("serpil"));
        System.out.println(front22("ha"));

    }
    public static String front22(String str) {
        String front= "";
       if(str.length()>=2){
           front =str.substring(0,2);
       }else{
           front=str;
       }
       return front+str+front;
    }

}
