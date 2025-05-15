package task4.replaceTypeCodeWithSubclasses;

public abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void process();

    public String getName() {
        return name;
    }
}

