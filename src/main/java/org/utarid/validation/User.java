package org.utarid.validation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public class User {

    @Size(min = 3, max = 15, message = "isim uzunluğu 3 ve 15 arasında olmali")
    private String name;

    @Min(value = 18, message = "yaş 18'den küçük olamaz")
    @Max(value = 99, message = "yaş 99'dan büyük olamaz")
    private int age;


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

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
