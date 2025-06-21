public class App {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i5", "8GB", "256GB SSD")
                .build();
        
        Computer gamingComputer = new Computer.Builder("AMD Ryzen 7", "16GB", "1TB SSD")
                .setCPU("AMD Ryzen 9") 
                .setRAM("32GB") 
                .build();

        Computer workstationComputer = new Computer.Builder("Intel Xeon", "64GB", "2TB SSD")
                .setStorage("4TB SSD") 
                .build();
        
        System.out.println(basicComputer);
        System.out.println(gamingComputer);
        System.out.println(workstationComputer);
    }
}
