package calculator;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Definitions {

    final static int WIDTH = 800, HEIGHT = 600;
    final static int HEXADECIMAL = 16;
    final static String stringOfSymbols = "\\+|\\-|\\*|\\/|\\^|\\√|\\=";

    /* If you change the order of the list then you also need to make sure to change in :
    https://github.com/Akiva-Grobman/Hexadecimal-calculator/blob/master/src/calculator/Calculator.java,
    the : ((List<?>)Definitions.buttonType.get(2)).forEach((symbol) -> {});
                                               ^
    (this loop is charge of the calculation so it has to take the symbols list)                                         
    */

    static List<Object> buttonType = new LinkedList<Object>(
        Arrays.asList(
            new LinkedList<String>(Arrays.asList( "1", "2", "3", "4", "5", "6", "7", "8", "9")),
            new LinkedList<String>(Arrays.asList("A", "B", "C", "D", "E", "F")),
            new LinkedList<String>(Arrays.asList(  "+", "-", "*", "/", "^", "√", "=")),
            "AC"
            )
        );
}