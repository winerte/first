package com.qf.pojo;

public class User {
    private Integer id;
    private String name;
    private String addres;
    private String sex;

    public User() {
    }

    public User(Integer id, String name, String addres, String sex) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
