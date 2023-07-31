import java.util.HashMap;

import symbols.Init;
import symbols.SymbolsInterface;
import view.UserDialog;

public class Calculator {
    private static HashMap<String, String> aMap;
    public static void main(String[] args) {
        Init init = new Init();
        aMap = SymbolsInterface.getActionsMap();
        UserDialog userDialog = new UserDialog(aMap);
    }
}
