package oca.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {

    public static void main1(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(16);
        list.add(18);
        list.add(19);
        list.add(11);
        list.add(9);

        List<Integer> result = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Results ::: "+result);
    }

    public static void main2(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(13);
        marks.add(16);
        marks.add(18);
        marks.add(19);
        marks.add(11);
        marks.add(9);

        List<Integer> result = marks.stream().map(i -> i + 5).collect(Collectors.toList());

        System.out.println("Results ::: "+result);
    }

    public static void main3(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(53);
        marks.add(86);
        marks.add(18);
        marks.add(49);
        marks.add(11);
        marks.add(90);

        long numberOfFailStudents = marks.stream().filter(i -> i<40).count();

        System.out.println("Results ::: "+numberOfFailStudents);
    }


    public static void main5(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(53);
        marks.add(86);
        marks.add(18);
        marks.add(49);
        marks.add(11);
        marks.add(90);

       /* Default sorted method use Comparable interface. In Comparable interface it uses
         compareTo() method.*/
        List<Integer> sortedListWithDefaultMethod = marks.stream().sorted().collect(Collectors.toList());

        List<Integer> sortedListWithoutDefaultMethod = marks.stream().sorted(Integer::compareTo)
                .collect(Collectors.toList());

        List<Integer> sortedListWithoutDefaultMethodInDecreasingOrder = marks.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Sorted in increasing order with default sorted method ::: "+sortedListWithDefaultMethod);
        System.out.println("Sorted in increasing order without default sorted method ::: "+sortedListWithoutDefaultMethod);
        System.out.println("Sorted in decreasing order without default sorted method ::: "+sortedListWithoutDefaultMethodInDecreasingOrder);
    }


    public static void main4(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(53);
        marks.add(86);
        marks.add(18);
        marks.add(49);
        marks.add(11);
        marks.add(90);

        /* Using compare(obj1,obj2) of Comparator interface. Since Comparator
        interface is functional interface so we can se lambda function.*/
        List<Integer> decreaseOrderSortedList = marks.stream().sorted((i,j) -> (i<j)?1:(i>j)?-1:0).collect(Collectors.toList());

        List<Integer> increaseOrderSortedList = marks.stream().sorted((i,j) -> i.compareTo(j)).collect(Collectors.toList());

        System.out.println("Sorted in increasing order ::: "+increaseOrderSortedList);
        System.out.println("Sorted in decreasing order ::: "+decreaseOrderSortedList);
    }

    public static void main7(String[] args) {
        ArrayList<String> cricketers = new ArrayList<>();
        cricketers.add("Sachin Tendulkar");
        cricketers.add("Sourav Ganguly");
        cricketers.add("MS Dhoni");
        cricketers.add("Virat Kohli");
        cricketers.add("Rahul Dravid");
        cricketers.add("VVS Laxman");
        cricketers.add("Irfan Pathan");

        List<String> naturalSorting = cricketers.stream()
                .sorted(String::compareToIgnoreCase).collect(Collectors.toList());

        List<String> sortedByLengthAscending = cricketers.stream()
                .sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());

        List<String> sortedByLengthDescending = cricketers.stream()
                .sorted((i,j) -> Integer.compare(j.length(), i.length())).collect(Collectors.toList());

        System.out.println("Cricketers sorted in natural order : "+naturalSorting);
        System.out.println("Cricketers sorted in increasing order according to thier name : "+sortedByLengthAscending);
        System.out.println("Cricketers sorted in decreasing order according to thier name : "+sortedByLengthDescending);

    }

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(53);
        marks.add(86);
        marks.add(18);
        marks.add(49);
        marks.add(11);
        marks.add(90);

        Optional<Integer> minimumMarks = marks.stream().min(Integer::compareTo);
        Optional<Integer> maximumMarks = marks.stream().min((i,j) -> j.compareTo(i));

        System.out.print("Minimum marks : ");
        minimumMarks.ifPresent(System.out::println);
        System.out.print("Maximum marks  : ");
        maximumMarks.ifPresent(System.out::println);
    }


    public static void main9(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(53);
        marks.add(86);
        marks.add(18);
        marks.add(49);
        marks.add(11);
        marks.add(90);

        //forEach method takes as Consumer interface as argument
        marks.forEach(i->System.out.print(" "+i*i));

        marks.stream().forEach(System.out::println);
        //marks.stream().forEachOrdered(System.out::println);

        Integer [] i = marks.toArray(new Integer[0]);
        Stream.of(i).forEach(System.out::println);
    }

    public static void main10(String[] args) {
        List<Integer> list = Stream.of(12,34,13,46,75,34,53,67).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    public static void main11(String[] args) {
        IntStream.range(1,10).forEach(System.out::println);
    }

    public static void main12(String[] args) {
        IntStream.range(1,10).skip(5).forEach(x -> System.out.print(" "+x));
    }

    public static void main13(String[] args) {
        System.out.println("Sum of Integers : "+IntStream.range(1,10).sum());
    }

    public static void main14(String[] args) {
        Stream.of(12,89,90,23,76,34).sorted().findFirst().ifPresent(System.out::println);
        Stream.of(12,89,90,23,76,34).sorted().findAny().ifPresent(System.out::println);
    }

    public static void main15(String[] args) {
        String[] names = {"Sachin","Virat","MS","Ravi"};
        Stream.of(names).filter(s->s.startsWith("S")).forEach(System.out::println);
    }

    public static void main17(String[] args) {
        Integer[] numbers = {2,3,4,5};
        Stream.of(numbers).map(x->x*x).forEach(System.out::println);
    }

    public static void main18(String[] args) {
        String[] names = {"Sachin","Virat","MS","Ravi"};
        Stream.of(names).map(String::toUpperCase).filter(s->s.startsWith("S")).forEach(System.out::println);
    }

    public static void main19(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"sachin",58));
        students.add(new Student(2,"rahul",65));
        students.add(new Student(3,"karthick",98));

        Map<Integer,String> map = students.stream()
                .collect(Collectors.toMap(Student::getId,Student::getName));
        map.forEach((k,v)-> System.out.println("Student id : " + k + " " + " Student name : " + v));
    }

    public static void main20(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"sachin",58));
        students.add(new Student(2,"rahul",65));
        students.add(new Student(3,"karthick",98));
        students.add(new Student(4,"Mohit",40));

       /* Reduce method generally takes two argument perform some operation and return same type as argument type.
        If this method is taking two argument then it returns Optional type.
        If this method is taking two argument then first will be default type and other two will be on which
        operation needs to perform and in this case it will return same type as argument type.*/
        Optional<Student> student = students.stream()
                .reduce((s1,s2)->(s1.getMarks()>s2.getMarks())?s1:s2);
        student.ifPresent(System.out::println);

    }

    public static void main21(String[] args) {
        int[] array = {21,13,45,21,34,67,40};
        IntStream.of(array).distinct().sorted().limit(3).forEach(System.out::println);
    }

    public static void main22(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "sachin", 58));
        students.add(new Student(2, "rahul", 65));
        students.add(new Student(3, "karthick", 98));
        students.add(new Student(4, "Mohit", 40));

        students.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).forEach(Student::display);

        System.out.println("\n Three Highest Scorer : ");
        students.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).limit(3).forEach(Student::display);
    }

    public static void main23(String[] args) {

        List<ExamStudent> students = new ArrayList<>();
        students.add(new ExamStudent(1, "Sachin", 18));
        students.add(new ExamStudent(2, "Rahul", 65));
        students.add(new ExamStudent(3, "Karthick", 98));
        students.add(new ExamStudent(4, "Mohit", 40));

        System.out.println("List of students who are eligible for exam : ");

        // Passing examHandler method to rules method of TestRules interface
        students.forEach(examStudent -> new Exam().doExam(examStudent,Examiner::examHandler));
    }

    public static void main24(String[] args) {
        List<ExamStudent> students = new ArrayList<>();
        students.add(new ExamStudent(1, "Sachin", 18));
        students.add(new ExamStudent(2, "Rahul", 65));
        students.add(new ExamStudent(3, "Karthick", 98));
        students.add(new ExamStudent(4, "Mohit", 40));

        /* Passing isNotSachin() method to test() method of Predicate interface. This is method reference.
          In lambda expression we pass method body as argument.
          Method Reference : Passing a implemented method to FunctionalInterface method. If we see any kind of this scenario
          then we can use method reference.*/
        students.stream().filter(StreamApi::isNotSachin).forEach(System.out::println);
    }

    public static boolean isNotSachin (ExamStudent examStudent){
        return !examStudent.getName().equals("Sachin");
    }

    public static void main25(String[] args) {
        List<MobileCompany> mobileCompanies = Collections.singletonList(new MobileCompany("Airtel", Arrays.asList(
                new User("Veru", 30, true),
                new User("MS", 24, true),
                new User("Sachin", 40, false),
                new User("Rohit", 34, true))));

        // Flat map is used when we are trying to perform stream operation on a list of list.
        // For example List<List<String>>
        mobileCompanies.stream().map(MobileCompany::getUsers)
                .flatMap(Collection::stream)
                .filter(User::getIsValid)
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
