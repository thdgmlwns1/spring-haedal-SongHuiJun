package com.group.libraryapp.domain.users;

import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id =null;
    @Column(nullable = false,length = 20,name="name")//name varchar(20)
    private String name;

    private Integer age;//column 어노테이션 생략가능 테이블에 있는거랑 완벽히 똑같아서


    protected User(){}

    public User(String name, Integer age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getID(){return id;}


    public void updateName(String name){
        this.name =name;
    }

}
