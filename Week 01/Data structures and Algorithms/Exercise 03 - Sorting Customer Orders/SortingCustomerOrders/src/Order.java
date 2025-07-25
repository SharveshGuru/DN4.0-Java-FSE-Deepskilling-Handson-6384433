public class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 350.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 780.00),
            new Order(4, "Diana", 450.20)
        };

        System.out.println("Original Orders:");
        for (Order o : orders) 
        System.out.println(o);

        bubbleSort(orders);
        System.out.println("\nBubble Sorted Orders:");
        for (Order o : orders) 
        System.out.println(o);

        orders = new Order[]{
            new Order(1, "Alice", 350.75),
            new Order(2, "Bob", 120.50),
            new Order(3, "Charlie", 780.00),
            new Order(4, "Diana", 450.20)
        };

        quickSort(orders, 0, orders.length - 1);
        System.out.println("\nQuick Sorted Orders:");
        for (Order o : orders) 
        System.out.println(o);
    }
}
