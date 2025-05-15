package task5.decomposeCondition;

import java.util.ArrayList;
import java.util.List;


public class User {
    private String username;
    private boolean loggedIn;
    private List<Resource> permissions;

    public User(String username) {
        this.username = username;
        this.loggedIn = false;
        this.permissions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void logIn() {
        this.loggedIn = true;
    }

    public void logOut() {
        this.loggedIn = false;
    }

    public void grantPermission(Resource resource) {
        permissions.add(resource);
    }

    public boolean hasPermission(Resource resource) {
        return permissions.contains(resource);
    }
}

