package Temp;

public class Employee extends StaffMember {
    private int workingDay;

    public Employee() {
    }

    public Employee(String name, int age, int workingDay) {
        super(name, age);
        this.workingDay = workingDay;
    }

    @Override
    public double Payment() {
        return workingDay * 10;
    }

    public Employee(int workingDay) {
        this.workingDay = workingDay;
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

}
