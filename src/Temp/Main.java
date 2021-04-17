package Temp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("So luong nhan vien can them: ");
        int numsOfEmployee = reader.nextInt();

        ArrayList<Employee> list = new ArrayList<>();
        String name;
        int age;
        int workingDay;
        reader.nextLine();

        for (int i = 1; i <= numsOfEmployee; i++) {
            System.out.println("Nhap nhan vien thu " + i + ": ");
            System.out.print("Nhap ten: ");
            name = reader.nextLine();
            System.out.print("Nhap tuoi: ");
            age = reader.nextInt();
            System.out.print("Nhap ngay lam viec: ");
            workingDay = reader.nextInt();
            reader.nextLine();
            Employee employee = new Employee(name, age, workingDay);
            list.add(employee);
        }

        System.out.println();
        int maxIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).Payment() > list.get(maxIndex).Payment()) {
                maxIndex = i;
            }
        }
        System.out.println("Nhan vien co luong cao nhat: ");
        System.out.println("Ten: " + list.get(maxIndex).getName() +
                "\nTuoi: " + list.get(maxIndex).getAge());

    }
}
