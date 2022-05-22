public class BmiService {
    public double calculate(double weight, double height) {
        double bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }
}
