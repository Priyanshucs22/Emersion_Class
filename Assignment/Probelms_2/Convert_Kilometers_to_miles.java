import java.util.*;
public class Convert_Kilometers_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilo = sc.nextInt();

        double miles = kilo * 0.621317;
        System.out.println(miles);
    }
}
