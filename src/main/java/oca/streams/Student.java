package oca.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private Integer id;
    private String name;
    private Integer marks;

    void display()
    {
        System.out.println("Id : "+ this.id + " Name : " + this.name + " Marks : " + this.marks);
    }
}
