public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 80;
        double height = 1.8;
        double bodyMassIndex = service.calculate(mass, height);
        System.out.println(bodyMassIndex);
    }
}
