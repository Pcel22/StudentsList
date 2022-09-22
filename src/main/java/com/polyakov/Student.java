package com.polyakov;

import javax.persistence.*;

@Entity
@Table(name = "students_list")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "contacts")
    private String contacts;

    @Column(name = "groupnum")
    private String groupNum;

    public Student() {
    }

    public Student(String firstName, String lastName, String contacts, String groupNum) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
        this.groupNum = groupNum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }
}


