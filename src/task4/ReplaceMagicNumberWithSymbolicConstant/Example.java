package task4.ReplaceMagicNumberWithSymbolicConstant;

import java.util.ArrayList;
import java.util.List;

public class Example {
    private static int MAX_ITEMS = 100;

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        for (int i = 0; i < MAX_ITEMS; i++) {
            items.add("Item " + i);
        }
    }
}
