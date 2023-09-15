package Task.Task19c;

public class Class2 extends Class1{

    String name = "Anderson";

    public static void main(String[] args) {
        Class2 object = new Class2();
       object.printName();
    }

        public void printName () {
            System.out.println("This is the value of class1 " + super.name);  //to print out the value of class1

            System.out.println("This is the value of class2 " + name);  //to print out the value of class2
        }


}

