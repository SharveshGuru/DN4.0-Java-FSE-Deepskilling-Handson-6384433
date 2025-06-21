import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Phone", "Electronics"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Watch", "Accessories" )
        };

        Product foundProduct = SearchUtility.linearSearch(products, "Shoes");
        if (foundProduct != null) {
            System.out.println("Linear Search Found: " + foundProduct.getProductName() + " in " + foundProduct.getCategory());
        } else {
            System.out.println("Product not found using Linear Search.");
        }

        Arrays.sort(products, Comparator.comparing(Product::getProductName, String.CASE_INSENSITIVE_ORDER));

        foundProduct = SearchUtility.binarySearch(products, "Shirt");
        if (foundProduct != null) {
            System.out.println("Binary Search Found: " + foundProduct.getProductName() + " in " + foundProduct.getCategory());
        } else {
            System.out.println("Product not found using Binary Search.");
        }
    }
}
