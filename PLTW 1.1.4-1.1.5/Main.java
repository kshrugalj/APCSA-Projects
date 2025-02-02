
public class Main {
    public static void main(String[] args) {
        /* PLTW 1.1.4 and 1.1.5 Compound Operators and Casting */
        //initializing variables
        int x = 10;
        int y = 4;
        int a = 8;
        int b = 4;
        int c = -6;
        int d = 3;
        int e = -3;
        double doublenumber = 8.4;

        //concatenate Strings
        String string1 = "My name is...";
        String string2 = "Kshrugal";
        String statement = string1 + string2;
        System.out.println(statement);

        //int division truncation examples
        //This example has truncation
        int result = x/y;
        System.out.println("The result of 10/4 is..."+ result);

        //This example of interger divesion with truncaation has no effect
        int result2 = a/b;
        System.out.println("The result of 8(positive)/4(positive) is..."+result2);

        //negative division
        //example of division with one positive and negative integer
        int result3 = c/d;
        System.out.println("The result of -6(negative)/3(positive) is..." + result3);

        //example of division with two negative integers 
        int result4 = c/e;
        System.out.println("The result of -6(negative)/-3(negative) is..." + result4);

        //example of mod with one positive and one negative integer
        int result5 = x % e;
        System.out.println("The result of 10(positive) mod -3(negative) is..." + result5);

        //double division examples
        //example of division using a double and an int
        double  result6 = doublenumber /y; 
        System.out.println("The result of 8.4(double)/4(int) is ..." + result6);
        //example of division using 2 doubles 
        System.out.println("The result of 8.4(double)/2.1(double) is..." + doublenumber/result6);

        //casting data types
        // Casting doubles to ints
        double double2 = 4.1;
        double double3 = 5.9;
        int int1 = (int) double2;
        int int2 = (int) double3;
        System.out.println("Casting 4.1 to int... " + int1);
        System.out.println("Casting 5.9 to int... " + int2);

        //Integer divison with parenthesis, cast to a double
        // Integer division within parenthesis, cast to a double
        double result7 = (double) (15/ 3);
        double result8 = (double) (15) / 3;
        System.out.println("Result of (double)(15 / 3)... " + result7);
        System.out.println("Result of (double)(15) / 3... " + result8);
  
        // Casting integer division to a double without truncation
        double result9 = (double) 15 / 3;
        System.out.println("Result of (double)15 / 3... " + result9);
  
        // Rounding workaround
        double numberToRound = 3.6;
        int roundedNumber = (int) (numberToRound + 0.5);
        System.out.println("Rounded number... " + roundedNumber);


        //order of operations
        int result10 = (6 / 2) - 2 % 6 + 3 + 10;
        int result11 = (6 % 2)+ 2 + (6*3) - 10;
        int [] values = {6,2,2,6,3,10};
        System.out.println("Result of (6 / 2) - 2 % 6 + 3 + 1)... " + result10);
        System.out.println("Result of (6 % 2)+ 2 + (6*3) - 10... " + result11);
        System.out.println("Result is..."+ values[5]+values[5]);

    }
}
