package symbols;

public class Init extends Symbols implements SymbolsInterface{
    public Init() {
        Addition addition = new Addition("+");
        Multiplication multiplication = new Multiplication("*");
        Division division = new Division("/");
    }

    @Override
    public void addSymbol(String symbol, String name) {

    }
}
