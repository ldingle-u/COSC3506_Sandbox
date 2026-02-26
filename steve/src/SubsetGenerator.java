
public class SubsetGenerator {

    public static void generateSubsets(String s) {
        generatingSubsets(s, "", 0);
    }

    private static void generatingSubsets(String s, String current, int index) {
        if (index == s.length()) {
            System.out.println(current);
            return;
        }
        
        generatingSubsets(s, current + s.charAt(index), index + 1);
        
        generatingSubsets(s, current, index + 1);
    }

    public static void main(String[] args) {
        String input = "RaceCar"; // I'm Creating the Sample input
        System.out.println("Subsets of: " + input);
        generateSubsets(input);
    }
}