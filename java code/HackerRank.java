/*Problem 1
Given the meal price (base cost of a meal),
tip percent (the percentage of the meal price being added as tip),
and tax percent (the percentage of the meal price being added as tax) 
for a meal, find and print the meal's total cost. Round the result to the nearest integer.*/

        import java.util.Scanner;

public class HackerRank{
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            double meal_cost = sc.nextDouble();
            int tip_percent = sc.nextInt();
            int tax_percent = sc.nextInt();
            sc.close();

            // calculate tax and tip
            double tip= (meal_cost *tip_percent)/100;
            double tax =(meal_cost*tax_percent)/100;

            //Type casting and adding the result
            int totalCost= (int) Math.round(meal_cost +tip +tax);
            System.out.print(totalCost);
        }
    }


