import java.util.*;
public class Average_Of_ThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();

        double ans = (a+b+c)/3;
        System.out.println(ans);
    }
}
