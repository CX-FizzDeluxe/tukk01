package befaster.solutions;

public class FizzBuzz {

    public static String s;

    public static String fizzBuzz(Integer number) {

        s = String.valueOf(number);

        try {
            Integer.parseInt(getBasicResult(number));
            return "" + number;
        } catch (NumberFormatException e) {

            if (number % 2 == 0) {
                return addStringAfter(getBasicResult(number), "deluxe");
            } else {
                return addStringAfter(getBasicResult(number), "fake deluxe");
            }
        }
    }

    public static String getBasicResult(Integer number) {

        if ((number % 3 == 0 || s.contains("3"))
                && !(number % 5 == 0 || s.contains("5"))) {

            return "fizz";
        } else if (!(number % 3 == 0 || s.contains("3"))
                && (number % 5 == 0 || s.contains("5"))) {

            return "buzz";
        } else if ((number % 3 == 0 || s.contains("3"))
                && (number % 5 == 0 || s.contains("5"))) {

            return "fizz buzz";
        }

        return "" + number;
    }

    public static boolean hasIdenticalDigits() {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[0] != chars[i]) {
                return false;
            }

        }

        return true;

    }

    public static String addStringAfter(String source, String toAdd) {
        return source + " " + toAdd;
    }
}
