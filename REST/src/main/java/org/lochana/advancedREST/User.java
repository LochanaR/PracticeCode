package org.lochana.advancedREST;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lochana on 11/12/15.
 */
@XmlRootElement
public class User {
    private String name;
    private int age;

    public User() {

    }

    public User(String aName, int anAge) {
        this.name = aName;
        this.age = anAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }
}
