package Task.Task14;

public class Class_B {
    public static void main(String[] args) {
        Class_A square = new Class_A();

      //set values for length and breadth
      square.setShapeBreadth(19);
      square.setShapeLength(19);

      //calculate the area of the square
        double area = square.getShapeLength() * square.getShapeBreadth();

        //print result
        System.out.println("The area of a square of length: " + square.getShapeLength() + " and breadth: " + square.getShapeBreadth() + " is " + area );

    }
}
