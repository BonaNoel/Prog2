
public class Tanulo {
    int age;
    String name;
    String gender;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender.toLowerCase();
    }

    public Tanulo(String s) {
        String tmp = s.replaceAll(" ", "");
        String[] split = (tmp.split("[;\\s]+"));
        age = Integer.parseInt(split[0]);
        name = split[1];
        gender = split[2];

    }

    public boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int compareAge(Tanulo valaki) {
        if (age < valaki.age) {
            return -1;
        } else if (age > valaki.age) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("Tanulo(%d, %s, %s)", age, name, gender.toLowerCase());
    }

}
