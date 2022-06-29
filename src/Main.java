public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 65; //кг.
        double height = 1.75; //м.
        double BodyMassIndex = service.calculate(weight, height);
        System.out.printf("Индекс массы тела: %.2f", BodyMassIndex);

    }
}
