/**
 * Created by Marcel on 3/15/2017.
 */
public class FizzBuzzThree {


    public static String getResult(int number) {

        if(number <= 0){
            return "Number should be greater than zero";
        }else if(number % 15 == 0){
           return "FizzBuzz";
        }else if(number % 3 == 0){
            return "Fizz";
        }else if(number % 5 == 0){
            return "Buzz";
        }

        return Integer.toString(number);
    }
}
