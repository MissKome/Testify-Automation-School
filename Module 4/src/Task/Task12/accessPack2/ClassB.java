package Task.Task12.accessPack2;

public class ClassB {
    public static void main(String[] args) {

        ClassB accessLevel = new ClassB();
        accessLevel.privateMethod();

    }

    //a private access level, can be accessed in only the class
    private void privateMethod(){
        System.out.println("This is a method");
    }


}
