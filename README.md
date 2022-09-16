
# JAVA Beginner Notes

A brief description of JAVA for beginner.

### Data Type, Operator and Expression
Objective:
- Introduction to JAVA programming.
- Construct simple programs using primitive data types, operators and expressions.

#### Task 1: Run your first programme

```java

public class HiKMJ
{
  public static void main(String[] args)
  {
    system.out.println("Hi KMJ"); // print message
  }
}
```

#### Task 2: Use \n to represent new line

```java

public class HiKMJ
{
  public static void main(String[] args)
  {
    system.out.print("\nMy name is Louis."); // print message
    system.out.print("\nI am from Malaysia."); // print message
    system.out.print("\nMy favourite colour is black."); // print message
  }
}
```

### Primitive Data Type

There are 4 primitive data types :
- int – store integer number value
- double – store decimal number value
- char – store single character 
- boolean – store true or false value

#### Task 3: Construct program using all data types
```java

class dataType
{
  public static void main(String[] args)
  {
    int age = 19;
    double height = 172.5;
    String name = "Louis";
    char gender = 'M';
    boolean malay= false;

    System.out.println("Name: "+ name);
    System.out.println("Gender: "+ gender);
    System.out.println("Age: "+ age);
    System.out.println("Height: "+ height);
    System.out.println("Malay?: "+ malay);
   
  }
}
```

### Scanner class
- The *Scanner* class is used to get user input and its found inthe java.util package.
- To use *Scanner* class, create an object of the class and use any available method found in *Scanner* class documentation.




