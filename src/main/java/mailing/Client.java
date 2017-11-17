package mailing;

public class Client {
    private String name;
    private int age;
    private Sex sex;
    private String characteristics;

    public Client(String name, int age, Sex sex, String characteristics) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.characteristics = characteristics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
