package oca.streams;

public class Examiner {

    static ExamStudent examHandler(ExamStudent examStudent)
    {
        //Rules of eligibility for appear to exam
        if(examStudent.getMarks() > 50){
            examStudent.setIsEligible(true);
        }
        else {
            examStudent.setIsEligible(false);
        }
        return examStudent;
    }
}
