package Interview_Questions_Study;

public class Armstrong {
    public static void main(String[] args) {

        int sum = 0;
        int digit;
        int temp;
        int number = 370;//27
        temp = number;
        while (temp > 0) {
            digit = temp % 10;//0  -7  -3
            sum = sum + (digit * digit * digit);//0 -343+ 27 ==370
            temp = temp / 10;//37  //34
        }
        if (number == sum) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println("degil");

        }
    }
}