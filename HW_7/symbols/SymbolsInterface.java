package symbols;

import java.util.HashMap;
import java.util.HashSet;

public interface SymbolsInterface {
    /**
     * actionsSet - список инициализированных арифметических действий
     */
    public static HashSet<String> actionsSet = new HashSet<>();
    public  static HashMap<String, String> actionsMap = new HashMap<>();

    default void addSymbol(String actionSymbol, String actionName) {
        actionsMap.put(actionSymbol, actionName);
    }

    public static HashMap<String, String> getActionsMap() {
        return actionsMap;
    }


}
