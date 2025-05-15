package task4.replaceTypeCodeWithSubclasses;

public class Type1Product extends Product {
    public Type1Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Поведінка для типу 1
        System.out.println("Processing Type 1 product: " + name);
    }
}

