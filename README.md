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

### Project
&emsp;[Product.java](https://github.com/CodebyLK/CSC211/blob/bbe56dd7b156d56de3bf8845cf793e7e5e3e5df0/Project/Product.java)


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

#### Product.java
# E-Commerce Platform Prototype

<br>

## Overview

This E-Commerce Platform has base classes for Product, User and Order. It features various subclasses that extend each base class and uses inheritance as well as lambdas. It also includes functionality for sorting and searching products.

___



### Product Class (base class)

This class sets up the basic structure for products within the platform. It includes private variables for name and price with getters for each. The constructor provides for creation of new object and initialization. There is a toString to display an elegant representation of a Product object when printed.

### Electronic Class (extends Product)

The Electronics class extends the Product class and has a constructor that takes arguments for name and price for initializing an Electronics object. It includes a call to the Products constructor using the keyword ```super()```.

### Clothing Class (extends Product)

The Clothing class is very similar to the Electronics class. It also extends the Product class and has a constructor that takes arguments for name and price for initializing an Clothing object. It includes a call to the Products constructor using the keyword ```super()```.

### Grocery Class (extends Product)

The Grocery class provides the structure for a grocery object. It includes one new private variable ```expirationDate```. It includes a constructor that takes arguments for name, price and expiration date and includes a call to the base class' constructor by using the keyword ```super```. There is also a getter and setter for the new expiration date variable for retrieving the date and appending the instance variable.

### User Class (base class)

The User class provides basic structure for users of the platform. It includes private variables ```userId``` and ```username```  as well as a constructor for creation of a User object and initialization. There are also getters for both the username and ID.

### Customer Class (extends User)

The Customer class extends the User class and represents a customer of the platform. It includes a private List variable called ```cart``` that holds Product objects. There is a constructor for creating and initializing customer objects that includes a call to the base class by using the keyword ```super```. There is a method ```addToCart``` that accepts a Product object and allows the user to add a selected product to the cart. There is a getter for the ```cart``` to allow for accessing products that are currently in the customer's cart.

### Admin Class (extends User)

This class represents an administrator of the platform. It has a private String variable, ```role```. There is a constructor for creating and initializing Admin objects that includes accepts arguements ```userId```, ```username``` and ```role``` and a call to the base class constructor using the keyword ```super```. There is getter for the instance variable role to retrieve the Admin's role.

### Order Class 

This class represents the customer's order. It includes a private variable customer of the type Customer that stores the customer making the purchaase. There is a private List of Product type objects named items for holding the items in the customer's order. There is a functional interface that accepts and Double type and returns a Double type called ```taxCalculator```. Another functional interface, ```shippingCalculator``` accepts a List type that holds Product objects and returns a Double type. The class' constructor creates and initializes a new order. Items from the customers cart are copied to the order using an addAll method. There is a method to clear the cart. Lambda expressions provide for initializing tax and shipping to zero. There is a getter for ```items``` as well as setters for ```taxCalculator``` and ```shippingCalculator```. There is a ```calculateTotal``` method that returns a double. It declares a double ```subtotal``` that is initialized to zero and uses an enhanced for loop to go through the items in the customers order and adds the price of each item to the subtotal using ```item.getPrice()```. The method calculates tax and shipping fees by applying the lambda expressions and finally returns the total by adding subtotal, tax and shipping fees.

<br>

### ProductService Class 

This class provides a way to manage the products in stock. It declares a private List of Product type objects names ```products```. There is a method ```addProducts``` that accepts a Product as an argument and adds the product to the List. There is a ```filterProducts``` methods that takes a Predicate as input and filters the products list based on the defined filter and returns the filtered products to a new List. There is a ```searchProductsByName``` method that accepts a String ```keyword```, as an argument, converts it to lowercase then filters the products list to only return products that contain the ```keyword``` to a new List. Finally, the ```getAllProducts``` method returns all products in inventory.


### Main Class (execution)

This class contains the main method for executing the program and creates instances of the ProductService, Electronics, Clothing, Grocery and Customers. It adds products to the cart and prints out the customers cart. A new order is created that automatically populates with products from the customer's cart. Tax and shipping are set using a lambda expression. The items in the order as well as the order total and cart after order are printed. There is an example of filtering to show only product with a price of more than $100. The search by name filter is demonstrated to find only products containing "Laptop". A second Customer is instantiated as well as a new order using a different tax rate and shipping rate. This customers order total is printed out using the ```calculateTotal``` method. A new Admin is instantiated and their User ID, username and role are printed. Finally, it demonstrates the use of filtering Grocery products by using instanceof with the Predicate and retrieving the expiration of the Grocery object.
