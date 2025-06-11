import java.util.*;
public class Calc_SI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prin = sc.nextInt();
        double rate = sc.nextInt();
        double time = sc.nextInt();

        double simple_Interest = (prin)*(rate)*(time)/100;
        System.out.println(simple_Interest);
    }
}
