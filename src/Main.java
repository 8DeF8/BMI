public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weightKg = 115f;
        float heightM = 1.74f;
        int bmi = (int) service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}