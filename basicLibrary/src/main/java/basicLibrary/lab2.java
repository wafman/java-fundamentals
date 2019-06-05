package basicLibrary;

import java.util.Random;

public class lab2 {

    public int[] roll(int n){
        int[] output = new int[n];
        Random rnd = new Random();
        for(int i = 0; i < output.length; i++){
            int result = rnd.nextInt(6) + 1;
            output[i] = result;
        }
        return output;
    }

    public boolean containsDuplicates(int[] arr){
        boolean answer = false;
        int previousValue = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; i < arr.length; i++){
                if(arr[i] == arr[j]){
                    answer =true;
                }
            }
        }
        return answer;
    }

    public double averages(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum / (double) arr.length;
        return avg;
    }

    public int[] avgAverages(int[][] arr){
        int[] ans = arr[0];
        double lowestAvg = averages(arr[0]);
        for(int i = 0; i < arr.length; i++){
            double currentAvg = averages(arr[i]);
            if(currentAvg < lowestAvg){
                lowestAvg = currentAvg;
                ans = arr[i];
            }
        }
        return ans;
    }

}
