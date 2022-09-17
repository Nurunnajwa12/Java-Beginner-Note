
# JAVA Notes

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
- The *Scanner* class is used to get user input and its found in the java.util package.
- To use *Scanner* class, create an object of the class and use any available method found in *Scanner* class documentation.

#### Task 4: Use Scanner to get user input 

```java

import java.util.Scanner; // Import scanner class
class OpDivision
{
  public static void main(String[] args)  
  {
      Scanner myObj = new Scanner(System.in); //create scanner object
      System.out.print("Enter your age: " );
      int age = myObj.nextAge();

      System.out.println("Your age is " + age);
  }
}

```
### Use of Control Structure

Objective: Construct program using control structure

```java

import java.util.Scanner; // Import scanner class
class OpDivision
{
  public static void main(String[] args)  
  {
      Scanner sc = new Scanner(System.in); //create scanner object
      
      System.out.print("Enter value 1: ");
      double val1 = sc.nextDouble();

      System.out.print("Enter value 2: ");
      double val2 = sc.nextDouble();

      double total= val1 + val2;
      double average= total / 2;

      System.out.println("Average is: " + average);


  }
}

```

Objective: Construct program using *selection* control structure

Overview:
 
 3 selection structure

- The if statement (Single selection) 
- The if-else statement (Dual selection) 
- The if – else - if statement (Multiple selection)

```java

import java.util.Scanner; // Import scanner class
class OpDivision
{
  public static void main(String[] args)  
  {
      Scanner sc = new Scanner(System.in); //create scanner object
      
      double payment, unit; // variable declaration

      System.out.print("Enter unit used: ");
      unit= sc.nextDouble();

      if(unit==0)
        {
            payment= unit * 0.20;
        }

      else
        {
            payment= (100*0.20)+((unit-100*0.23));

        }

        System.out.println("Electricity payment: RM " + payement); // display output
        
  }
}

```





#### Example

Look into this [file](https://github.com/Nurunnajwa12/Java-Beginner-Note/blob/main/passfaildual.java) for more information about selection control structure.

