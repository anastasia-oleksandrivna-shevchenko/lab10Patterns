package task1.largeClass;

class PersonInfoDisplay {
    public void displayPersonInfo(Person person) {
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Friends: " + person.getFriendManager().getFriends());
        System.out.println("Enemies: " + person.getFriendManager().getEnemies());
        System.out.println("Tasks: " + person.getTaskManager().getTasks());
    }
}
