class ParentClass {
    void parentMethod() {
        System.out.println("This is parent class");
    }
}

class ChildClass extends ParentClass {
    void childMethod() {
        System.out.println("This is child class");
    }
}

public class classes {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
       
        parent.parentMethod();
        child.childMethod();
        child.parentMethod();
    }
}
