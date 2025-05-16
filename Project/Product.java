import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price;
    }
}

class Electronics extends Product {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Clothing extends Product {
    public Clothing(String name, double price) {
        super(name, price);
    }
}

// Grocery.java
class Grocery extends Product {
    private String expirationDate; // Example specific attribute for Grocery

    public Grocery(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}


class User {
    private int userId;
    private String username;

    public User(int userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getUserId() {
        return userId;
    }
}


class Customer extends User {
    private List<Product> cart;

    public Customer(int userId, String username) {
        super(userId, username);
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product) {
        this.cart.add(product);
    }

    public List<Product> getCart() {
        return cart;
    }
}


class Admin extends User {
    private String role; // Example attribute for Admin

    public Admin(int userId, String username, String role) {
        super(userId, username);
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}


class Order {
    private Customer customer;
    private List<Product> items;
    private Function<Double, Double> taxCalculator;
    private Function<List<Product>, Double> shippingCalculator;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
        this.items.addAll(customer.getCart());
        customer.getCart().clear();
        this.taxCalculator = total -> 0.0; // Default no tax
        this.shippingCalculator = items -> 0.0; // Default free shipping
    }

    public List<Product> getItems() {
        return items;
    }

    public void setTaxCalculator(Function<Double, Double> taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public void setShippingCalculator(Function<List<Product>, Double> shippingCalculator) {
        this.shippingCalculator = shippingCalculator;
    }

    public double calculateTotal() {
        double subtotal = 0;
        for (Product item : items) {
            subtotal += item.getPrice();
        }
        double tax = taxCalculator.apply(subtotal);
        double shippingFee = shippingCalculator.apply(items);
        return subtotal + tax + shippingFee;
    }
}


class ProductService {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public List<Product> filterProducts(Predicate<Product> filter) {
        return products.stream()
                       .filter(filter)
                       .collect(Collectors.toList());
    }

    public List<Product> searchProductsByName(String keyword) {
        String lowerCaseKeyword = keyword.toLowerCase();
        return products.stream()
                       .filter(product -> product.getName().toLowerCase().contains(lowerCaseKeyword))
                       .collect(Collectors.toList());
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

// Main.java
class Main {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        productService.addProduct(new Electronics("Laptop", 1200.00));
        productService.addProduct(new Clothing("T-Shirt", 25.00));
        productService.addProduct(new Electronics("Headphones", 200.00));
        productService.addProduct(new Grocery("Apples", 2.00, "2025-05-20")); // Adding a Grocery item

        Customer customer = new Customer(1, "john.doe");
        customer.addToCart(productService.getAllProducts().get(0)); // Add Laptop to cart
        customer.addToCart(productService.getAllProducts().get(1)); // Add T-Shirt to cart
        customer.addToCart(productService.getAllProducts().get(3)); // Add Apples to cart

        System.out.println("Customer's Cart: " + customer.getCart());

        Order order = new Order(customer);

        // Example tax calculation (8% of subtotal) using a lambda
        order.setTaxCalculator(subtotal -> subtotal * 0.08);

        // Example shipping calculation ($5 flat fee) using a lambda
        order.setShippingCalculator(products -> 5.00);

        System.out.println("Order items: " + order.getItems());
        System.out.println("Order total: $" + order.calculateTotal());
        System.out.println("Customer's Cart after order: " + customer.getCart());

        // Using lambda for filtering products with price > 100
        List<Product> expensiveProducts = productService.filterProducts(p -> p.getPrice() > 100);
        System.out.println("\nExpensive products: " + expensiveProducts);

        // Basic search by name (using streams)
        List<Product> laptopResults = productService.searchProductsByName("Laptop");
        System.out.println("\nSearch results for 'Laptop': " + laptopResults);

        // Another order with different tax and shipping
        Customer anotherCustomer = new Customer(2, "jane.doe");
        anotherCustomer.addToCart(productService.getAllProducts().get(2)); // Add Headphones
        Order anotherOrder = new Order(anotherCustomer);
        anotherOrder.setTaxCalculator(subtotal -> subtotal * 0.05); // Different tax rate
        anotherOrder.setShippingCalculator(products -> products.size() * 2.00); // Shipping per item
        System.out.println("\nAnother order total: $" + anotherOrder.calculateTotal());

        // Example of using the Admin class
        Admin adminUser = new Admin(101, "admin1", "Super Admin");
        System.out.println("\nAdmin User: ID=" + adminUser.getUserId() + ", Username=" + adminUser.getUsername() + ", Role=" + adminUser.getRole());

        // Example of accessing Grocery specific attribute
        List<Product> groceryProducts = productService.filterProducts(p -> p instanceof Grocery);
        if (!groceryProducts.isEmpty()) {
            Grocery apples = (Grocery) groceryProducts.get(0);
            System.out.println("\nGrocery item: " + apples.getName() + ", Expires on: " + apples.getExpirationDate());
        }
    }
}
