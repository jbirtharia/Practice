package oca.streams;

import lombok.Data;


@Data
class ExamStudent {

    private Integer id;
    private String name;
    private Integer marks;
    private Boolean isEligible=false;

    public ExamStudent(Integer id, String name, Integer marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}
