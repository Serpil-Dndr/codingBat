package Interview_Questions_Study;

public class Fibonacci {
    public static void main(String[] args) {
        // 0, 1,1,2,3,5,8,13
        int first = 0;
        int second=1;
        int count =10;
        int next ;
        System.out.print(first+ " "+ second);
        for(int i =2; i<count; i++){
            next =first+second;// onceki iki numaranin toplami //
            //0, 1, 1,2, 3
            first =second;//
            second = next ;
            System.out.print(" "+ next);


        }

    }
}
