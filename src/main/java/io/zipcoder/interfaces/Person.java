package io.zipcoder.interfaces;

public class Person {
    final Long id;
    private String name;


    public Person(long id, String name) {
        this.name = name;
        this.id = id;
    }
        public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}

