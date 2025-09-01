package model;

import org.testng.annotations.DataProvider;

public class CreateEmployee {
    private String name;
    private String salary;
    private String durationWorked;
    private String grade;
    private String email;

    public CreateEmployee(String name, String salary, String durationWorked, String grade, String email) {
        this.name = name;
        this.salary = salary;
        this.durationWorked = durationWorked;
        this.grade = grade;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }

    public String getDurationWorked() {
        return durationWorked;
    }

    public String getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }


    }

