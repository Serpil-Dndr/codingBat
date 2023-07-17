package Interview_Questions_Study;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(division(26, 11));
    }
    public static String division(int divident, int divisor) {
        int quotient = 0;
        int remainder = 0;
        while(divident >= divisor) {
            divident = divident - divisor;//15  -4
            quotient++;//1  2
            remainder = divident;//15  -4
        }

        return "quotient = " + quotient + " remainder = " + remainder;}
}
