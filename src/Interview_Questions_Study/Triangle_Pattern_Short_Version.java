package Interview_Questions_Study;

public class Triangle_Pattern_Short_Version {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < 2*n -1; i++) { //row
            int row = i;
            // int row = i > n-1? row = 2*n - i -1 : i +1;
            if(i > n-1){
                row = 2*n - i -1;
            }else{ row = i +1;
            }
            for (int j = 0; j <row; j++) { //inner
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    }


