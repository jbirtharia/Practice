package oca.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{

    void display() throws IOException{
        System.out.println("In display..");
    }
}

class Child extends Parent{

    void display(){
        System.out.println("In display");
    }
}

public class ExceptionHandling {
}
