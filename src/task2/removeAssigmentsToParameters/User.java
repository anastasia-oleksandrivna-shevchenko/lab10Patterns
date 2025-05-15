package task2.removeAssigmentsToParameters;

public class User {
    private String name;
    private Boolean registered;

    public User(User inputUser) {
        this.name = inputUser.getName();
        this.registered = inputUser.getRegistered();
    }
    public User(String name, Boolean registered) {
        this.name = name;
        this.registered = registered;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getRegistered() {
        return registered;
    }
    public void setRegistered(Boolean registrated) {
        this.registered= registrated;
    }
}
