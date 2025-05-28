public class Product {
    
    private String productName;
    private String productId;
    private double price;
    private int stockQuantity;

    
    public Product(String productName, String productId, double price, int stockQuantity) {
        this.productName = productName;
        this.productId = productId;
        setPrice(price); 
        this.stockQuantity = stockQuantity;
    }

    
    public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Invalid! Price must be greater than 0.");
        }
    }

    public void purchase(int quantity) {
        if (quantity > 0 && quantity <= stockQuantity) {
            stockQuantity -= quantity;
            System.out.println(quantity + "purchased.");
        } else {
            System.out.println("Invalid quantity");
        }
    }


    public void restock(int quantity) {
        if (quantity > 0) {
            stockQuantity += quantity;
            System.out.println(quantity + "restocked.");
        } else {
            System.out.println("Invalid! must be greater than 0.");
        }
    }

    // Method to display product info
    public void printDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name: " + productName);
        System.out.println("Price : Rs" + price);
        System.out.println("Stock: " + stockQuantity);
    }

    // Main method to test
    public static void main(String[] args) {
        Product p1 = new Product("Earbud", "WM123", 2500.99, 50);

        System.out.println("First Product Details:");
        p1.printDetails();

        p1.purchase(5);
        
        p1.restock(10);

        p1.setPrice(-20);

        System.out.println("\nUpdated Product Details:");
        p1.printDetails();
    }
}
