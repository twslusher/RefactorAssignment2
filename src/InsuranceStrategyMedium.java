public class InsuranceStrategyMedium extends InsuranceStrategy {
    @Override
    public int getConstant() {
        return 38600;
    }

    @Override
    public double getWeight() {
        return 0.01;
    }

    @Override
    public int getAdjustment() {
        return 25000;
    }
}
