import java.util.*;
public class perimeter_of_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int wid = sc.nextInt();

        int peri = 2 * (len + wid);
        System.out.println(peri);
    }
}
