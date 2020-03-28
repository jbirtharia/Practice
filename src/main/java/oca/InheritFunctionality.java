package oca;

interface interf{
    static int var = 30;
}

class Parent{
    public static int parent = 3;

    static void display(){
        System.out.println("In parent");
    }
}

class Child extends Parent  implements interf{

    public static int parent = 8;
    public void print(){
        System.out.println("Hello..."+Child.parent);           //valid
        Child.display();                                       //valid
        //Child.var;
    }
}

public class InheritFunctionality {

    public static void main(String[] args) {
        Child child = new Child();
        child.print();
        //child.parent;             Not valid
        //child.display();          Not valid
    }
}



