package task1.largeClass;

class Person {
    private String name;
    private int age;
    private String gender;
    private FriendManager friendManager;
    private TaskManager taskManager;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friendManager = new FriendManager();
        this.taskManager = new TaskManager();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public FriendManager getFriendManager() {
        return friendManager;
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }
}

