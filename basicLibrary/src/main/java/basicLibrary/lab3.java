package basicLibrary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Scanner;

public class lab3 {
    public String analyzeWeather(int[][] arr){
        int count = 1;
        int max = 0;
        int min = 1000;
        String answer = "";
        HashSet<Integer> temps = new HashSet();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                temps.add(arr[i][j]);
                if(arr[i][j] < min){
                    min = arr[i][j];
                } else if(arr[i][j] > max){
                    max = arr[i][j];
                }
                count++;
            }
        }
        answer += answer.format("High: %d\nLow: %d\n", max, min);
        for(int i = min; i < max; i++){
            if(!temps.contains(i)){
                answer += answer.format("Never saw temperature: %d\n", i);
            }
        }
        return answer;
    }

    public String tally(ArrayList<String> arr){
        HashMap<String, Integer> votes = new HashMap();
        String[] plants = new String[]{"Bush", "Shrub", "Hedge"};
        for(String plant : plants){
            votes.put(plant, 0);
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == "Bush"){
                int votesSoFar = votes.get("Bush");
                votes.put("Bush", votesSoFar + 1);
            } else if(arr.get(i) == "Shrub"){
                int votesSoFar = votes.get("Shrub");
                votes.put("Shrub", votesSoFar + 1);
            } else if(arr.get(i) == "Hedge"){
                int votesSoFar = votes.get("Hedge");
                votes.put("Hedge", votesSoFar + 1);
            }
        }
        int max = 0;
        String winner = "";
        for(String plant : plants){
            int count = votes.get(plant);
            if (count > max){
                max = count;
                winner = plant;
            }
        }
        return winner;
    }
}
