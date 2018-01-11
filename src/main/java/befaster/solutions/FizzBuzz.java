package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        if (number % 3 == 0 && number % 5 != 0) {
            return "fizz";
        } else if (number % 5 == 0 && number % 3 != 0) {
            return "buzz";
        } else if (number % 5 == 0 && number % 3 == 0) {
            return "fizz buzz";
        } else {
            return "" + number;
        }

    }

}
