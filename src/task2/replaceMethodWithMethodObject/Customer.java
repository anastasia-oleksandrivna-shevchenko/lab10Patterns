package task2.replaceMethodWithMethodObject;

public class Customer {
    private String name;
    private Boolean VIP;

    public Customer(String name, Boolean VIP) {
        this.name = name;
        this.VIP = VIP;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean isVIP() {
        return VIP;
    }
    public void setVIP(Boolean VIP) {
        this.VIP = VIP;
    }
}
