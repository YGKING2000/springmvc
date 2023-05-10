package com.example.mvcemployee.pojo.entity;

/**
 * @author YGKING e-mail:hrd18960706057@163.com
 * @version 1.0
 * @description
 * @className Employee
 * @date 2023/05/11 17:45
 */
public class Employee {
    private Integer id;
    private String title;
    private Double salary;
    private String job;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                ", job='" + job + '\'' +
                '}';
    }
}
