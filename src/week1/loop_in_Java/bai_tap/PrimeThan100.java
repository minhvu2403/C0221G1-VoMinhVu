package week1.loop_in_Java;

public class PrimeThan100 {
    public boolean checkisPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public void checkPrime(){
        for (int i = 1; i < 100; i++) {
            if (checkisPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrimeThan100 checkprime =new PrimeThan100();
          checkprime.checkPrime();

    }
}
