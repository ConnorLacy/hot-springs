package com.cldesigns.accessmongodbdatarest;

import org.springframework.data.annotation.Id;

public class Person {
    @Id private String id;

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }

}