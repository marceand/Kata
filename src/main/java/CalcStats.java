/**
 * Created by Marcel on 3/16/2017.
 */
public class CalcStats {

    public static int getSequenceLength(int[] sequence) {
        return sequence.length;
    }

    public static double calculateAverageValue(int[] sequence) {
        double totalSum = 0;

        for(int index = 0; index < sequence.length; index++){
            totalSum = totalSum+sequence[index];
        }

        return totalSum/sequence.length;
    }

    public static int findMinimumValue(int[] sequence) {

        int minimum = sequence[0];

        for(int index = 0; index<sequence.length; index++){

            if(sequence[index]<minimum){
                minimum = sequence[index];
            }

        }

        return minimum;
    }

    public static int findMaximumValue(int[] sequence) {
        int maximum = sequence[0];

        for(int index = 0; index<sequence.length; index++){

            if(sequence[index]>maximum){
                maximum = sequence[index];
            }

        }

        return maximum;
    }
}
