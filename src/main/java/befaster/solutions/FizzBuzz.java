package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {

        String s = String.valueOf(number);
        
        if ((number % 3 == 0 || s.contains("3")) && 
               !(number % 5 == 0 || s.contains("5"))) {
            
            return "fizz";
        } else if (!(number % 3 == 0 || s.contains("3")) && 
               (number % 5 == 0 || s.contains("5"))) {
            
            return "buzz";
        } else if ((number % 3 == 0 || s.contains("3")) && 
               (number % 5 == 0 || s.contains("5"))) {
            
            return "fizz buzz";
        }

        return null;
    }
}
