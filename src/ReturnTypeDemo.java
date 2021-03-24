public class ReturnTypeDemo {
    public static void main(String[] args) {
        ReturnTypeDemo returnTypeDemo=new ReturnTypeDemo();
        int flour=returnTypeDemo.grind(2);
        System.out.println("Flour made from Flour Maker Machine: "+flour);
        int moneyReturned=returnTypeDemo.getCurrency("Visa","luna007",500);
        System.out.println("Money Returned: "+moneyReturned);

    }

    public int grind(int amountOfWheat) {
        System.out.println("Wheat Grind: " + amountOfWheat);
        int flour = amountOfWheat - 1;
        return flour;
    }

    public int getCurrency(String atmCard, String password, int amountRequested) {
        System.out.println("If ATM Card and Password is correct then provide money");
        int moneyToReturn = amountRequested;
        return moneyToReturn;
    }
}


