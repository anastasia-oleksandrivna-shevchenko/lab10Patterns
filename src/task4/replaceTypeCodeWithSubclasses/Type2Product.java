package task4.replaceTypeCodeWithSubclasses;

public class Type2Product extends Product {
    public Type2Product(String name) {
        super(name);
    }

    @Override
    public void process() {
        // Поведінка для типу 2
        System.out.println("Processing Type 2 product: " + name);
    }
}

