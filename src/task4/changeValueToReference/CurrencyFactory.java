package task4.changeValueToReference;

import java.util.HashMap;
import java.util.Map;

public class CurrencyFactory {
    private static Map<String, Currency> currencies = new HashMap<>();

    public static Currency getCurrency(String code) {
        if (!currencies.containsKey(code)) {
            currencies.put(code, new Currency(code));
        }
        return currencies.get(code);
    }
}
