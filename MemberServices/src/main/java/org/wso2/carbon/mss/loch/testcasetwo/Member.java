package org.wso2.carbon.mss.loch.testcasetwo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by lochana on 11/4/15.
 */
@XmlRootElement
public class Member {
    private String name;
    private int age;
    public Member(){

    }
    public Member(String memberName, int memberAge) {
        this.name = memberName;
        this.age = memberAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
