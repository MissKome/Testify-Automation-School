package Task.Task12.accessPack1;public class ClassA {
    public static void main(String[] args) {
        ClassA accessLevel = new ClassA();
        accessLevel.publicMethod();

    }

     //a public access level, can be accessed in class, package, subclass,everywhere
    public  void publicMethod(){
        System.out.println("This is a public access method");
    }
}
