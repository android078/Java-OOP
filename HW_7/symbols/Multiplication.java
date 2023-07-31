package symbols;

public class Multiplication extends Symbols implements SymbolsInterface {
    String actionSimbol;;
    String actionName = "Multiplication (умножение)";

    public Multiplication (String simbol) {
        this.actionSimbol = simbol;
        this.actionName = actionName;
        addSymbol(actionSimbol, actionName);
    }

    public String getActionName() {
        String out = this.actionName;
        return actionName;
    }
    public String getSimbol() {
        return actionSimbol;
    }

    public static int action(int num1, int num2) {
        return (num1 * num2);
    }
}
