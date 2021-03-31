package week1.loop_in_Java.bai_tap;

public class First20Prime {
    public boolean checkinPrime(int n) {
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

    public void checkPrime(int number) {
        int count = 0;
        int i = 2;
        while (count < number) {
            if (checkinPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        First20Prime result = new First20Prime();
        result.checkPrime(20);

    }
}
