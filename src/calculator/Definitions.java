package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Definitions {

    final static int WIDTH = 800, HEIGHT = 600;
    final static int HEXADECIMAL = 16;
    final static String stringOfSymbols = "\\+|\\-|\\*|\\/|\\^|\\√|\\=";
       
    static List<String> buttonsPanelOrder = new LinkedList<String>(
        Arrays.asList( 
      "AC","√", "^", "+",
            "A", "B", "C", "-",
            "D", "E", "F", "*",
            "1", "2", "3", "/",
            "4", "5", "6", "=",
            "7", "8", "9" 
        )
    );    
    
}