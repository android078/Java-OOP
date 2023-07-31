package symbols;

public class Division extends Symbols implements SymbolsInterface {
    String actionSymbol;;
    String actionName = "Division (деление)";

    public Division (String symbol) {
        this.actionSymbol = symbol;
        this.actionName = actionName;
        addSymbol(actionSymbol, actionName);
    }

    public String getActionName() {
        String out = this.actionName;
        return actionName;
    }
    public String getSymbol() {
        return actionSymbol;
    }

    public static double action(int num1, int num2) {
        if (num2 != 0) {
            return (num1/num2); }
        else {
            System.out.println();
            System.out.println("========== Деление на ноль невозможно! ==========");
            return -1;
        }
    }
}
