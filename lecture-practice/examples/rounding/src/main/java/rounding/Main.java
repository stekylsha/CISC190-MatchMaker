/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package rounding;

public class Main {
    private static enum AverageTypes {
        BigDecimal(new AverageBD()),
        Double(new AverageD());

        private Averager avg;

        private AverageTypes(Averager avg) {
            this.avg = avg;
        }

        public void average(double[] nums) {
            avg.average(nums);
        }
    };

    private static double[] nums = {
        10.1,
        11.2,
        12.3,
        13.4,
        14.5
    };

    public static void main(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                try {
                    AverageTypes.valueOf(arg).average(nums);
                } catch (IllegalArgumentException iae) {
                    System.out.println("No averager for type \'" + arg + "\'.");
                }
            }
        }
    }
}