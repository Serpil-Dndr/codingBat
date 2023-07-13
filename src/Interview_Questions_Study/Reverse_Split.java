package Interview_Questions_Study;

public class Reverse_Split {

    public static void main(String[] args) {

        String str = "Asil";
        String [] reversed= str.split("");
       // System.out.println(Arrays.toString(reversed));
        String reversedStr="";
        for(int i= reversed.length-1; i>=0;i--){
            reversedStr+= reversed[i];
        }
        System.out.println(reversedStr);
    }
}
