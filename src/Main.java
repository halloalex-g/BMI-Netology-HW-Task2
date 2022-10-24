import java.text.DecimalFormat;

public class Main {
    static double mass = 80;
    static double height = 1.8;

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        BmiService service = new BmiService();

        double bodyMassIndex = service.calculate(mass, height);
        System.out.println(df.format(bodyMassIndex));

    }

}
