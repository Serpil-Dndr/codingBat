package day01;

public class C03_Question_Palindrome {
    public static void main(String[] args) {
/*
Given any String determine if itis Palindrome. Print“Palindrome”if itis and “Not Palindrome”if
itis not:
    */
        String str = "madam";
        String str2 ="";
        for (int i= str.length()-1 ; i>= 0 ;i--)
            str2 += str.charAt(i);

        if(str.equalsIgnoreCase(str2)){
            System.out.println("It is Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}