/*
 * Activity 1.3.7
 */
public class ShapeEquals {
  public static void main(String[] args) {
    Shape shape1 = new Shape();
    shape1.setShape("Triangle", 3);

    Shape shape2 = new Shape();
    shape2.setShape("Square", 4);

    Shape shape3 = shape1;
    shape3.setShape("Hexagon", 6);

    Shape shape4 = new Shape();
    shape4.setShape("Square", 4);

    Shape shape5 = null; // Create shape5 and initialize it to null

    System.out.println("Shape 1 == Shape 2: " + (shape1 == shape2));
    System.out.println("Shape 2 == Shape 3: " + (shape2 == shape3));
    System.out.println("Shape 1 == Shape 3: " + (shape1 == shape3));
    System.out.println("Shape 1 == Shape 4: " + (shape1 == shape4));
    System.out.println("Shape 2 == Shape 4: " + (shape2 == shape4));
    System.out.println("Shape 3 == Shape 4: " + (shape3 == shape4));

    // Use the equals method to compare shapes
    System.out.println("Shape 1 equals Shape 2: " + shape1.equals(shape2));
    System.out.println("Shape 2 equals Shape 3: " + shape2.equals(shape3));
    System.out.println("Shape 1 equals Shape 3: " + shape1.equals(shape3));
    System.out.println("Shape 1 equals Shape 4: " + shape1.equals(shape4));
    System.out.println("Shape 2 equals Shape 4: " + shape2.equals(shape4));
    System.out.println("Shape 3 equals Shape 4: " + shape3.equals(shape4));

    // Compare object references and values with shape5
    System.out.println("Shape 4 == Shape 5: " + (shape4 == shape5));
    System.out.println("Shape 4 equals Shape 5: " + shape4.equals(shape5));


    System.out.println(shape1.getShape());
  }
}
