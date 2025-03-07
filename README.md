# CSC 211 Computer Programming II Repository

<font size= "4">This repository contains assignments for Spring 2025 Computer Programming II.</font>  

## 1. Table of Contents
### Module 1
&emsp;[hello.txt](https://github.com/CodebyLK/CSC211/blob/7e6cf34cbd0bea6f4a77d73eae7ba96881d1a6b0/Module1/hello.txt)   
&emsp;[RandNum.java](https://github.com/CodebyLK/CSC211/blob/7e6cf34cbd0bea6f4a77d73eae7ba96881d1a6b0/Module1/RandNum.java)  

### Module 2
&emsp;[BankApp.java](https://github.com/CodebyLK/CSC211/blob/7e6cf34cbd0bea6f4a77d73eae7ba96881d1a6b0/Module2/Bank.java)

### Module 3
&emsp;[Automobile.java](https://github.com/CodebyLK/CSC211/blob/7e6cf34cbd0bea6f4a77d73eae7ba96881d1a6b0/Module3/Automobile.java)

### Module 4
&emsp;[Shape.java](https://github.com/CodebyLK/CSC211/blob/a06650e78b9669c8c7b5473478f6417307997b7b/Module4/Shape.java)

### Module 5

&emsp;[SimpleProgram.java](https://github.com/CodebyLK/CSC211/blob/97a2f85d283ad8942294e8d67ed31d28bdbd3aea/Module5/SimpleProgram.java)  
&emsp;[SimpleProgramTest.java](https://github.com/CodebyLK/CSC211/blob/97a2f85d283ad8942294e8d67ed31d28bdbd3aea/Module5/SimpleProgramTest.java)  

## 2. Program Details
### Module 1

#### hello.txt  
This is a simple test program that prints hello.  

#### RandNum.java 
This is a random number guessing game. First, the Random class is used to generate a random number between 1 and 10. The user is then prompted to guess the correct number and is given up to five guesses. Feedback is provided to the user throughout the course of the game in the form of "Too high" or "Too low." Finally, upon conclusion of the game the player is given the opportunity to either play again or end the game.  

### Module 2

#### BankApp.java
This program simulates a bank with methods for both deposits and withdrawals. It contains an array of doubles that keeps track of all deposits and withdrawals. The user can make deposits into the account and withdrawals from the account. At the conclusion of the transaction a receipt is printed with a list of all transactions along with the account balance.  

### Module 3

#### Automobile.java
This automobile program demonstrates inheritance. It has an Automobile superclass with methods for accelerate, decelerate, honk, reverse, forward and stop. It also demonstrates the compareTo and equals methods. The program has three subclasses (Car, SportsCar and JunkCar) that extend the superclass. Each subclass includes methods that override the superclass. The main method instantiates an object for each of the subclasses and an array is created to hold each object and demonstrate the methods.

### Module 4

#### Shape.java
This program demonstrates the Java constructor and getter and setter. The Shape class has a variable (numSides) that sets the number of sides for a shape along with a constructor, a getter and setter. There are two subclasses (Circle and Rectangle) that extend the Shape class. Each subclass contains a method to calculate the area of the shape. The main method creates a new Scanner object and instantiates a new Circle and a new Rectangle object. The main method retrieves the number of sides of the Circle using the getter. Finally, the area methods of both the Circle and Rectangle are called taking in user input and calculating the area of each shape.

### Module 5

#### SimpleProgram.java

The SimpleProgram class contains two methods called arrayEvens and numSquare. The method arrayEvens takes no parameters but declares an array of 10 elements and sets the elements to all the even numbers between 2 and 20 inclusive using a for loop then returns the array. The method numSquare take one integer as a parameter and returns the square of the number.

#### SimpleProgramTest.java

Two JUnit test methods are in the class SimpleProgramTest. The first method, called arrayTest declares an array with 10 elements with each element initialized with even numbers between 2 and 20 inclusive and assigns it to the variable arrayTest. An assertArrayEquals is called to check the equality of arrayTest and the array returned from arrayEvens. The method numSquareTest contains two assertions. The first, assertEquals, checks if 9.0 is equal to the numSquare method if 3 is given as the parameter. The second, assertNotEquals, checks if 15.0 does not equal numSquare given a parameter of 4.
