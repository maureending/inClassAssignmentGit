package jiajing.inclassassignment05_jiajingc;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by G on 2/23/17.
 */

public class Student implements Serializable {

    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {

        this.name = name;
        this.age = age;
        this.gpa = gpa;

    }

    public String getName() {
        return name;
    }

    /**public void setName(String name) {
        this.name = name;
    }*/

    public int getAge() {
        return age;
    }

    /**public void setAge(int age) {
        this.age = age;
    }*/

    public double getGpa() {
        return gpa;
    }

     /**public void setGpa(double gpa) {
        this.gpa = gpa;
    }*/

}
