package symbols;

import java.util.HashMap;
import java.util.HashSet;

abstract public class Symbols implements SymbolsInterface {

    /**
     * Метод, возвращающий список инициализированных арифметических действий
     * @return
     */
    public static HashSet<String> getActionsSet() {
        return actionsSet;
    }
    public static HashMap<String, String> getActionsMap() {
        return actionsMap;
    }
}
