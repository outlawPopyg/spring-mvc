package ru.itis.spring_mvc;

import ru.itis.spring_mvc.validators.CheckEmail;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Минимум два символа")
    private String name;
    @NotEmpty(message = "lastName is required")
    @NotBlank(message = "lastName is required")
    private String lastName;

    @Min(value = 500, message = "must be greater than 499")
    @Max(value = 1000, message = "must be less than 1001")
    private Integer salary;
    private String department;
    private String gun;

    @Pattern(regexp = "\\+7\\d{10}", message = "+7XXXXXXXXXX")
    private String phoneNumber;
    @CheckEmail(value = "gmail.com", message = "email must ends with 'gmail.com'")
    private String email;
    private Map<String, String> depMap;
    private Map<String, String> gunMap;
    private String[] favoriteHorses;

    public Employee() {
        depMap = new HashMap<>();
        depMap.put("Глава банды", "Глава банды");
        depMap.put("Стрелок", "Стрелок");
        depMap.put("Рабочий в лагере", "Рабочий в лагере");

        gunMap = new HashMap<>();
        gunMap.put("Scholfield revolver", "Scholfield revolver");
        gunMap.put("Colt revolver", "Colt revolver");
        gunMap.put("Le'mat revolver", "Le'mat revolver");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getGunMap() {
        return gunMap;
    }

    public String[] getFavoriteHorses() {
        return favoriteHorses;
    }

    public void setFavoriteHorses(String[] favoriteHorses) {
        this.favoriteHorses = favoriteHorses;
    }

    public void setGunMap(Map<String, String> gunMap) {
        this.gunMap = gunMap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public Map<String, String> getDepMap() {
        return depMap;
    }

    public void setDepMap(Map<String, String> depMap) {
        this.depMap = depMap;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
