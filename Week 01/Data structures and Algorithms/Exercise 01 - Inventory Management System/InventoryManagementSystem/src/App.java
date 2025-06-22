public class App {
    public static void main(String[] args) throws Exception {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 50, 70000);
        Product p2 = new Product(102, "Mouse", 200, 500);
        
        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.viewAllProducts();

        manager.updateProduct(101, "Gaming Laptop", 40, 85000);
        manager.viewAllProducts();

        manager.deleteProduct(102);
        manager.viewAllProducts();

    }
}
