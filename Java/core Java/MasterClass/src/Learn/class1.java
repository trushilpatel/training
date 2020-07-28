package Learn;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Employee{
    int code;
    String name;
    float salary;
    long l = 1000000000000L;

    void readData(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Employee code : ");
        code = s.nextInt();
        s.nextLine();
        System.out.print("Enter Employee name : ");
        name = s.nextLine();
        System.out.print("Enter Employee salary : ");
        salary = s.nextFloat();
    }

    public String toString(){
        return "Employee Code : " + code +
                "\nEmployee name : " + name +
                "\nEmployee salary : " + salary;
    }

    void showData(){
        System.out.println("Employee Code : " + code +
                           "\nEmployee name : " + name +
                           "\nEmployee salary : " + salary);
    }
}


public class class1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.readData();
        e.showData();
        System.out.println(e);
    }
}
