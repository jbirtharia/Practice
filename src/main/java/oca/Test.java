package oca;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main1(String[] args) {
        int [] primes = {1,2,3,5,7,11,13,17};
        int [] reverse = {0,0,0,0,0,0,0,0};
        int sum = 0;
        int pos = 0;
        for (int x:primes) {
            sum = sum+x;
            reverse[7-pos] = x;
            pos++;
        }
        System.out.println(sum + " " + reverse[0]);
    }
    void start()
    {
        long [] a1 = {1,2,3};
        long [] a2 = adjust(a1);
        System.out.println(a2[0] + a2[1] + a2[2] + " ");
        System.out.println(a1[0] + a1[1] + a1[2]);
    }

    private long[] adjust(long[] a3) {
        a3[2] = 4;
        return a3;
    }

    public static void main2(String[] args) {
        Test test = new Test();
        test.start();
    }

    public static void main3(String[] args) {
        List<Long> longs = new ArrayList<Long>();
        longs.add(new Long(1));
        longs.add(2L);
        longs.add(new Long("3"));
        System.out.println(longs.indexOf(new Long(3)));
        System.out.println(longs.contains(new Long(3)));
    }

    public static void main4(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Sachin"));
        students.add(new Student("Rahul"));
        System.out.println(students.indexOf(new Student("Sachin")));
        System.out.println(students.contains(new Student("Sachin")));
    }

    public static void main5(String[] args) {
        Parrotlet parrotlet = new Parrotlet();
        parrotlet.chirp(420);
        parrotlet.chirp(565151232132155618l);
    }

    public static void main(String[] args) {
        Wooper wooper = new Wooper();
        System.out.print(wooper.jump(5) + " ");
        wooper.printJumps(5);
    }
}

class Wooper{
    public int jump (int i){
        System.out.print(printJumps(i++) + " "); return i;
    }

    public int printJumps(int i) {
        System.out.print("Jump: " + i++ + " "); return i;
    }

}

class Parrot{
    void chirp(int loud){
        System.out.println("CHIRP");
    }
}

class Parrotlet extends Parrot{

    void chirp(long loud) {
        System.out.println("chirp");
    }
}

interface java{
    public void main(String args[]);
}