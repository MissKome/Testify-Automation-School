package Task;

public class Task19d {
    String name = "Delta";

   public void printName(String userName){
       System.out.println("Instance member: " + name);
       System.out.println("User name: " + userName);
   }

    public static void main(String[] args) {
        Task19d task19d = new Task19d();
        task19d.printName("Joy");
    }

}
