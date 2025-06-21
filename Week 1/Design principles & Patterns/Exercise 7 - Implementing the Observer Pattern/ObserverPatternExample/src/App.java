public class App {
    public static void main(String[] args){
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("MobileApp1");
        Observer webApp = new WebApp("WebApp1");

        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        stockMarket.setPrice(100.0);
        stockMarket.setPrice(105.5);    
        stockMarket.deregister(webApp);
        stockMarket.setPrice(110.0);
    }
}
