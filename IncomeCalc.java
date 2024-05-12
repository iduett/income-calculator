package cop2805;

public class IncomeCalc {
	public static void main(String[] args) {
		System.out.println("Sales Amount\t\tIncome");

		for (double salesAmount = 1000; salesAmount <= 20000; salesAmount += 1000) {
			double commission = computeIncome(salesAmount);
			System.out.printf("%.2f\t\t%.2f%n", salesAmount, commission);
		}
	}

	public static double computeIncome(double salesAmount) {
		final double BASE_SALARY = 5000.00;
		final double eightPercent = 5000.00;
		final double tenPercent = 10000.00;

		double commission = 0.0;

		if (salesAmount <= eightPercent) {
			commission = salesAmount * 0.08;
		} else if (salesAmount <= tenPercent) {
			commission = (eightPercent * 0.08) + ((salesAmount - eightPercent) * 0.10);
		} else {
			commission = (eightPercent * 0.08) + ((tenPercent - eightPercent) * 0.10)
					+ ((salesAmount - tenPercent) * 0.12);
		}

		return commission + BASE_SALARY;
	}
}

