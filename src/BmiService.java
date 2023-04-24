public class BmiService {
    public int calculate(double heightM, int weightKg) {
        double heightSquared;
        heightSquared = heightM * heightM;

        double bodyMassIndex = weightKg / heightSquared;

        return (int) bodyMassIndex;

    }

}
