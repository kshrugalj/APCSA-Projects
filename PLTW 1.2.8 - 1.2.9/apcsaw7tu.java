/* Purpose: Finishing assignments PLTW 1.2.8-1.2.9
PLTW: 1.2.8-1.2.9
date:9-27-2023
Name: Kshrugal Jangalapalli */
           
class apcsaw7tu {
    public static void main(String[] args) 
    {
    //this is for constructing two integers into objects and assigning them both a value(Step 1) 
    Integer numberOne = Integer.valueOf(1);
    Integer numberTwo = Integer.valueOf(2);
    // System.out.println("The value of the 2nd Integers is: " + numberTwo);//this is the second integer and has a value of 2 
    //Step 2 
    int firstNumber = numberOne;// a 
    // System.out.println(firstNumber);
    int secondNumber;
    secondNumber = numberTwo.intValue();//b 
    int threeNumber = 3;//c
    Integer numberThree = Integer.valueOf(threeNumber);//d 
    //Step 5
    System.out.println("The value of this Integer is: " + numberOne);//this is the first integer and has a value of 1 (a)
    System.out.println("The value of the first primitive: "+ firstNumber);//b
    System.out.println("The primitive using .intValue(): " + secondNumber);//c
    System.out.println("The value of the last Integer object is: " + numberThree );//d
    System.out.println("This is an example of two of the variables/objects where the symbol acts like a concatenation operator: " 
    +numberOne+numberTwo);//e
    int integerNumberOne = numberOne + numberTwo;
    System.out.println("This is an example of using two of the above variables/objects in an expression: " + integerNumberOne);//f
    //Step 6
    // int i = intobject.intValue();
    //Step 7
    int maxValue = Integer.MAX_VALUE;
    int minValue = Integer.MIN_VALUE;
    System.out.println("This is the MAX VALUE in Java: " + maxValue);
    System.out.println("This is the  MINIMUM VALUE in Java: " + minValue);
    //Step 8
    Integer customMinValue = Integer.valueOf(Integer.MIN_VALUE + 2147483647);
    System.out.println("Custom Min Value: " +customMinValue);//Custom Min Value
    Integer customMaxValue = Integer.valueOf(Integer.MAX_VALUE - 2147483547);
    System.out.println("Custom Min Value: "  +customMaxValue);//Custom Max Value
    //Step 9
    int variable = 9;
    System.out.println(Math.abs(variable));//a
    int base = 3;
    int exponent = 4;
    System.out.println(Math.pow(base, exponent));//b (power function always returns in double form)
    System.out.println(Math.sqrt(variable));//c (negative number return NaN)
    //Step 10
    double randomDouble = Math.random();
    System.out.println("A random double from 0.0 to 0.9: "+randomDouble);//a 
    int truncatedInteger = (int) randomDouble;
    System.out.println("Cast the above variable to an int to show the truncation effect: "+truncatedInteger);//b
    double randomInt = Math.random()*10 ;//using double to and multiplying by 10 
    int truncatedInteger09 = (int) randomInt;//truncating the double value to integer 
    System.out.println("A random integer from 0 to 9: "+    truncatedInteger09);//c
    double randomInt110 = (Math.random()*10)+1;//using double to find decimal and multiplying 10 and adding 1 to make sure there is no 0
    int truncatedInt110 = (int) randomInt110;//truncating value to make integer
    System.out.println("A random integer from 1 to 10: "+    truncatedInt110);//d
    double randomInt1100 = (Math.random()*100)+1;//using double to find demimal and multiply by 100 and adding 1 to make sure range is 1-100
    int truncatedInt1100 = (int) randomInt1100;//truncating value to make integer from double 
    System.out.println("A random integer from 1 to 100: "+truncatedInt1100);//e
    double randomIntMult2 = (Math.random()*100);//making double and multiply by 100 (still in double form)
    int variable1 = (int)randomIntMult2 % 2;//making double to integer and using mod to find if the number is even or not
    if (variable1 ==0){//if mod value is 0(which means the number is even) than goes into if statement 
        int truncatedIntMult2 = (int) randomIntMult2;//turning into an integer from double value 
        System.out.println("A random integer that produces only multiples of 2: "+ truncatedIntMult2);//f
    } else{//if mod value is 1(which means the number is odd), than goes into else statement
        int variable2 = (int) randomIntMult2 +1;//adding 1 to original number to make even since it's odd 
        System.out.println("A random integer that produces only multiples of 2: "+ variable2);//f
    }

    double randomNegInt = (Math.random()*100)*-1;//using double to find decimal and multiply by 100 and -1 to make negative number
    int truncatedNegInt = (int) randomNegInt;//truncating negative double value to integer 
    System.out.println("A random negative integer: " + truncatedNegInt);//g
    double randomIntNeg55 = (Math.random()*11)-5;//Multiplying by 11 to and subtracting 5 to make rang between -5 and 5
    int truncatedIntNeg55 = (int) randomIntNeg55;//Turning double to integer
    System.out.println("A random integer between -5 and 5: "+ truncatedIntNeg55);//h
    }
}