package com.codeclan.walmart.Walmart;


import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @Column(name = "employees")
    private ArrayList<Employee> assignees;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.assignees = new ArrayList<>();
    }

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Employee> getAssignees() {
        return assignees;
    }

    public void setAssignees(ArrayList<Employee> assignees) {
        this.assignees = assignees;
    }
}
