package task4.replaceTypeCodeWithClass;

public class ProductType {
    private String name;

    public ProductType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Можна додати equals, hashCode, toString
    @Override
    public String toString() {
        return name;
    }
}

