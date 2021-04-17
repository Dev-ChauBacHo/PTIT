package Temp;

public abstract class StaffMember {
    public String name;
    public int age;

    public StaffMember() {
    }

    public StaffMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double Payment();

}
