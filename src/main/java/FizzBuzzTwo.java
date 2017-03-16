/**
 * Created by Marcel on 3/14/2017.
 */
public class FizzBuzzTwo {
    public static String getResult(int number) {

        if(number <= 0){
          return "Number must be greater than zero";
        } else if(number % 15 == 0){
            return "fizzbuzz";
        }else if(number % 3 == 0){
            return "fizz";
        }else if(number % 5 == 0) {
            return "buzz";
        }

        return Integer.toString(number);
    }
}
