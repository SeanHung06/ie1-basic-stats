public class MinMaxCalculation {
    public static void ComputeMax(double[] numbers) {
        double max = numbers[0];
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max: " + max);
    }
    public static void ComputeMin(double[] numbers) {
        double min = numbers[0];
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Min: " + min);
    }
}
