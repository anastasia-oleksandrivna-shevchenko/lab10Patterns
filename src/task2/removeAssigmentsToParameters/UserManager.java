package task2.removeAssigmentsToParameters;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    private List<User> users = new ArrayList<>();


    public void addUser(User inputUser) {
        if (inputUser != null) {
            User userToAdd = new User(inputUser); // створюємо копію або новий об'єкт
            userToAdd.setRegistered(true);
            users.add(userToAdd);
        }
    }

    public List<User> getUsers() {
        return users;
    }
    // Інші методи класу...

}
