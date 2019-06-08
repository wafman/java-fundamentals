package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        System.out.println(findErrors("src/main/resources/gates.js"));
    }

    public static int findErrors(String path){
        int numErrors = 0;
        String errorMessage = "";
        try{
            Scanner s = new Scanner(new File(path));
            int lineNum = 0;
            while(s.hasNextLine()){
                lineNum++;
                String line = s.nextLine();
                if(line.endsWith("}") || line.endsWith("{") || line.contains("if") || line.contains("else") || line.length() < 1){
                    continue;
                } else if(!line.endsWith(";")) {
                    numErrors++;
                    errorMessage += String.format("Line %d: missing semi-colon.\n", lineNum);
                }

            }
        } catch(FileNotFoundException e){
            numErrors = -1;
            System.out.println("File was not found");
            System.out.println(e);
        }
        System.out.println(numErrors);
        return numErrors;
    }
}
