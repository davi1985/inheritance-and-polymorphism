package entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double basicTax;

        if (getAnnualIncome() < 20000.0) {
            basicTax = getAnnualIncome() * 0.15;
        } else {
            basicTax = getAnnualIncome() * 0.25;
        }

        basicTax -= getHealthExpenditures() * 0.5;

        return Math.max(basicTax, 0.0);
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
}
