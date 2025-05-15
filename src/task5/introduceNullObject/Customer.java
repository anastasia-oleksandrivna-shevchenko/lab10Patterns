package task5.introduceNullObject;

public class Customer {
    private Address address;

    public Customer(Address address) {
        if (address == null) {
            this.address = new NullAddress();
        } else {
            this.address = address;
        }
    }

    public Address getAddress() {
        return address;
    }
}
