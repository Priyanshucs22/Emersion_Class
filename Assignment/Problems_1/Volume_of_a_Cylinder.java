import java.util.*;
public class Volume_of_a_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextInt();
        double rad = sc.nextInt();

        double volume = 3.14 * rad * rad * height;   
        System.out.println(volume);
    }
}
