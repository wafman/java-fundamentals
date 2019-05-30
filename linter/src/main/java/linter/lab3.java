package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        findErrors("gates.js");
    }

    public String findErrors(){
        Scanner s = new Scanner(new File("./src/main/resources/gates.js"));
        String errorMessage = "";
        while(s.hasNextLine()){
            String line = s.nextLine();
            //use locale() for line number
            //use
            if(!line.endsWith(";")){
                if(line.endsWith("}") || line.endsWith("{") || line.contains("if") || line.contains("else") || line.length() == 0){
                    continue;
                } else {
                    errorMessage += String.format("Line %d: missing semi-colon.", s.locale());
                }
            }
        }
        return errorMessage;
    }
}
