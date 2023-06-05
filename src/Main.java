// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double salesTax = 0.05;
        int purchaseCost = 20;
        double taxCost;
        double totalCost;

        taxCost = purchaseCost * salesTax;
        totalCost = taxCost + purchaseCost;

        System.out.println("The total cost is " + totalCost + " and the cost of tax is " + taxCost); // Output statements
    }
}