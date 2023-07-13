package Interview_Questions_Study;

public class Palindrome {
    public static void main(String[] args) {
        int num = 546;
        int reverse=0 , temp =num;
        while (temp !=0){
            int remainder = temp %10 ; // 545 % 10 = 5
            reverse = reverse *10 +remainder ; // 0 *10 +5 = 5
            temp = temp/10 ; //545/10=54


        }
        if(num == reverse){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome ");
        }
    }

}
