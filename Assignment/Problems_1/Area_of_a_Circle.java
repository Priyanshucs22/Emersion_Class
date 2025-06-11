import java.util.*;
public class Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad = sc.nextInt();

        double area = 3.14 * rad * rad;
        System.out.println(area);
    }
}
