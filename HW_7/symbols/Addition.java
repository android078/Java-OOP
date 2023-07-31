package symbols;

public class Addition extends Symbols implements SymbolsInterface {
    String actionSymbol;
     String actionName = "Addition (сложение)";

    /**
     * Конструктор класса
     * @param symbol - символ класса ("+"), принимается от класса Init
     */
    public Addition (String symbol) {
        this.actionSymbol = symbol;
        this.actionName = actionName;
        addSymbol(actionSymbol,actionName);
    }

    public String getActionName() {
        System.out.println("Попытка вывода actionName");
        return actionName;
    }

    public String getSymbol() {
        return actionSymbol;
    }

    public static int action(int num1, int num2) {
        return (num1 + num2);
    }
}
