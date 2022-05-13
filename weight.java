package converters;

/*
 * WeightConverter is a simple program that converts a unit of weight
 * and displays it in both kilograms and pounds.
 * 
 * To use the program from the command-line:
 * java WeightConverter 5.0
 *  
 * To use the program from the console:
 * 
 */

import java.util.Scanner;

class WeightConverter {
    
    // Get unit of weight from a user via the console.
    private static double getWeight() {
        double weight = 0.0;
        
        System.out.print("Enter unit of weight: ");
        try(Scanner scan = new Scanner(System.in)) {
            if(scan.hasNextDouble()) {
                weight = scan.nextDouble();
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        
        return weight;
    }
    
    // Convert pounds to kilograms.
    private static double poundsToKilograms(double pounds) {
        return pounds / 2.225;
    }
    
    // Convert kilograms to pounds.
    private static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.225;
    }
    
    // Handle instance variables and method calls.
    public static void main(String args[]) {
        double start, lbs, kgs;
        
        // Handle command-line/console usage.
        if(args.length == 1) {
            start = Integer.parseInt(args[0]);
        } else {
            start = getWeight();
        }
        
        lbs = start;
        
        // Display unit of weight as lb(s) to kg(s).
        kgs = poundsToKilograms(lbs);
        System.out.printf("%.2f lb(s) is %.2f kg(s).\n", lbs, kgs);
        
        // Display unit of weight as kg(s) to lb(s).
        lbs = kilogramsToPounds(kgs);
        System.out.printf("%.2f kg(s) is %.2f lb(s).\n", kgs, lbs);
    }
}