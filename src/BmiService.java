public class BmiService {
    public float calculate(float weight, float height) {
        int bmi = (int) (weight / (height * height));
        return bmi;
    }
}
