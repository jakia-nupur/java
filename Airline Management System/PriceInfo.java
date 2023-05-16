public class PriceInfo {
    int price;
    PriceInfo() {} // Default constructor
    public void showPriceInfo() {
        System.out.println("\t\t\t\t----------Price Info----------\n\n" +
				"\t\t\t\t**********Abroad Flight**********\n\n" +
                "\t\t\t\t1. Bangladesh --> United States: 60,000 BDT\n" +
                "\t\t\t\t2. Bangladesh --> Canada: 50,000 BDT\n" +
                "\t\t\t\t3. Bangladesh --> Germany: 40,000 BDT\n" +
                "\t\t\t\t4. Bangladesh --> Australia: 55,000 BDT\n\n" +
				
                "\t\t\t\t**********Domestic Flight**********\n\n" +
                "\t\t\t\t1. Dhaka --> Cox's Bazar: 5,000 BDT\n" +
                "\t\t\t\t2. Dhaka --> Barisal: 3,000 BDT\n" +
                "\t\t\t\t3. Dhaka --> Jessore: 2,500 BDT");
        System.out.println("\n\n====================================================================================================\n\n");
    }
}
