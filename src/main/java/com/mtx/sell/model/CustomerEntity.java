package com.mtx.sell.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerEntity{

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    public CustomerEntity(){}

    public CustomerEntity(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
