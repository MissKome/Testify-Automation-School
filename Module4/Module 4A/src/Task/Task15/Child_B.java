package Task.Task15;

public class Child_B extends Parent_A {

    void fruit() {
        System.out.println("I bought you apple.");
    }

    void career() {
        System.out.println("You are now a tech bro.");
    }

    public static void main(String[] args) {
       Child_B parenting = new Child_B();
        //Parent_A parenting = new Parent_A();

        // Invoke methods from class A
        parenting.foods();
        parenting.cloths();
        parenting.sports();


        // Invoke methods from class B

      parenting.fruit();
      parenting.career();
    }




}
