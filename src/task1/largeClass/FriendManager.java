package task1.largeClass;

import java.util.ArrayList;
import java.util.List;

class FriendManager {
    private List<String> friends;
    private List<String> enemies;

    public FriendManager() {
        this.friends = new ArrayList<>();
        this.enemies = new ArrayList<>();
    }

    public void addFriend(String friend) {
        this.friends.add(friend);
    }

    public void removeFriend(String friend) {
        this.friends.remove(friend);
    }

    public void addEnemy(String enemy) {
        this.enemies.add(enemy);
    }

    public void removeEnemy(String enemy) {
        this.enemies.remove(enemy);
    }

    public List<String> getFriends() {
        return new ArrayList<>(friends);
    }

    public List<String> getEnemies() {
        return new ArrayList<>(enemies);
    }
}
