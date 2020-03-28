package oca.streams;

public class Exam {

    public void doExam(ExamStudent examStudent, TestRules testRules)
    {
        examStudent = testRules.rules(examStudent);  //Checking eligibility of student by passing them to TestRules interface
        if(examStudent.getIsEligible())
            System.out.println(examStudent.getName());
    }
}
