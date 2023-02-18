import java.util.Scanner;
public class BMI{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Weight :");
        double Weight = sc.nextDouble();
        System.out.print("Enter your Height:");
        double Height = sc.nextDouble();
        double BMI;
        BMI = Weight / (Height*Height);
        if (BMI >= 25.0)
            System.out.println("Please reduce your weight");
        else 
            System.out.println("Your have an ideal weight");
        
    }
    
}