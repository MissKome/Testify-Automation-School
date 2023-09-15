package Task.Task16B;

public class Child extends Parent {
    public static void main(String[] args) {
        Child child = new Child();
        child.school();
        child.food();
    }

   public void school (){
        System.out.println("I will go to a different school");
    }

   public void food (){
        System.out.println("Only 2 plates of food");
    }


}
