package warmUp_1;

public class Diff21 {
    /*
    Given an int n, return the absolute difference between n and 21,
    except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
     */
    public static void main(String[] args) {
        Diff21 num = new Diff21();
      num.diff21(10);

    }

    public int diff21(int n) {

        if (n < 21) {
            System.out.println(21 - n);
        } else {
            System.out.println(2 * (n-21));
        }
        return n;
    }
}




