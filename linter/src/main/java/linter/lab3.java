package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
        System.out.println(findErrors(lint("resources/gates.js"));
    }

    public static String findErrors(String path){
        //path resources/gates.js
        Scanner s = new Scanner(new File(path));
        String errorMessage = "";
        while(s.hasNextLine()){
            String line = s.nextLine();
            //use locale() for line number
            //use
            if(!line.endsWith(";")){
                if(line.endsWith("}") || line.endsWith("{") || line.contains("if") || line.contains("else") || line.length() == 0){
                    continue;
                } else {
                    //use string builder instead
                    errorMessage += String.format("Line %d: missing semi-colon.", s.locale());
                }
            }
        }
        return errorMessage;
    }
}
