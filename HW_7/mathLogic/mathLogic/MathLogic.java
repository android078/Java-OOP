package mathLogic;

import java.util.HashMap;

import symbols.Addition;
import symbols.Division;
import symbols.Multiplication;
import symbols.Symbols;

public class MathLogic {
    public HashMap<String,String> aMap;
    Addition add;
    Multiplication mult;
    Division div;
public MathLogic(HashMap<String, String> aMap) {
        this.aMap = Symbols.actionsMap;
    }

    public int additionNumbers(int num1, int num2) {
        return Addition.action(num1, num2);
    }
    public int multiplication(int num1, int num2) {
        int result = Multiplication.action(num1,num2);
        return result;
    }
    public double division(int num1, int num2) {
        return Division.action(num1,num2);
    }
}
