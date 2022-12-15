public class User implements Comparable<User> {

    private String name;
    private int age;


    public int getAge() {
        return this.age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(int age) {
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(User other) {

        // negativ: this < other
        // 0: this == other
        // pozitiv: this > other

        return this.name.compareTo(other.name);

    }

}
