package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Definitions {

    final static int WIDTH = 800, HEIGHT = 600;

    static List<String> lettersArray  = new LinkedList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));
    static List<String> numbersArray  = new LinkedList<String>(Arrays.asList( "1", "2", "3", "4", "5", "6", "7", "8", "9"));   
    static List<Object> buttonType = new LinkedList<Object>(Arrays.asList("+", "-", "*", "/", "^", "√", "=", numbersArray, lettersArray, "AC"));

}