package ru.klepekov.game.model;

/**
 * Created by alexey on 20.03.16.
 */
public class JustJson {

    private String name;
    private Integer age;

    public JustJson() {

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JustJson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
