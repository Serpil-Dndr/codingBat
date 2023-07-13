package Interview_Questions_Study;

public class Palindrome_loop {
    public static void main(String[] args) {
        String str = "Kabak";
        String reversed ="";
        for(int i = str.length()-1; i>=0 ;i-- ){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);



    }

}
