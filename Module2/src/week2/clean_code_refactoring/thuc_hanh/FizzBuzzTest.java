package week2.clean_code_refactoring.thuc_hanh;

public class FizzBuzzTest {
    public static String fizzBuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 3 == 0;
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        }
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return number + "";
    }
}
