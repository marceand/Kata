/**
 * Created by Marcel on 3/13/2017.
 */
public class FizzBuzzOne {
    public static int getResult(int givenNumber) {


        if(givenNumber%3 ==0){
            return 1;
        }else if(givenNumber%5==0){
            return 2;
        }else if(givenNumber%15==0){
            return 3;
        }

        return givenNumber;
    }
}
