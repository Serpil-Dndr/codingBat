package Interview_Questions_Study;

public class Triangle02 {
    public static void main(String[] args) {

              int n =5;
           for(int row=0; row<n ;row++){
               //space
               for(int j=0 ;j<row;  j++){
                   System.out.print("  ");
               }
               //star
               for(int i =0; i<2*n-1-2*row;i ++){
                   System.out.print("* ");
               }
               //space
               for(int j=0 ;j <row;j++){
                   System.out.print("  ");
               }
               System.out.println();
           }
    }
}
