//2nd Q
import java.io.*;
import java.util.Random;

public class ProductSumCalculator {
    public static void main(String[] args) {
        // 5 URL links for Tech & products
        String[] linkArray = {
            "https://www.amazon.ca/Apple-iPhone-16-Pro-Max/dp/B0DHJ896RY",
            "https://www.staples.ca/products/3102503-en-apple-airpods-max-usb-c-midnight?listId=search",
            "https://www.bestbuy.ca/en-ca/product/segway-gokart-pro2-electric-go-kart-25km-max-range-43km-h-top-speed-dark-grey-only-at-best-buy/17921529",
            "https://www.samsung.com/ca/smartphones/galaxy-s25-ultra/buy/",
            "https://www.canadiantire.ca/en/pdp/canvas-bala-outdoor-patio-replacement-cushion-set-grey-0881979p.html?rq=Patio+Cushions+"
        };

        double[] priceArray = { 1669.91, 679.99, 2699.99, 1918.99, 499.99 };

        // By using Buffered output and creating 10,000 random links to file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("links.txt"))) {
            Random rand = new Random();
            for (int i = 0; i <= 10000; i++) {
                int index = rand.nextInt(5);
                writer.write(linkArray[index]);
                writer.newLine(); //making it one per line
            }
        } catch (IOException e) {
            System.out.println("cant write in the file: " + e.getMessage());
        }

        // creating 5 double values to store sums of a product
        double[] sumArray = new double[5];
//reading file using buffered reader
        try (BufferedReader reader = new BufferedReader(new FileReader("links.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) { 
                for (int i = 0; i < linkArray.length; i++) {
                    if (line.equals(linkArray[i])) {
                        sumArray[i] += priceArray[i];
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Cant read file: " + e.getMessage());
        }

        for (int i = 0; i < sumArray.length; i++) {  //printing the product links and sum of the arrays products
            System.out.printf("Sum of all Product #%d: $%.2f%n", i + 1, sumArray[i]);
            System.out.printf("Product #%d link: %s%n%n", i + 1, linkArray[i]);
        }
    }
}
