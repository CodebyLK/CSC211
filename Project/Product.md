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
