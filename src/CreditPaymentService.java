public class CreditPaymentService {
    public int calculate(int creditSumRub, int creditTimeMonths, double yearRate) {
        double monthRate = yearRate / (100*12);
        double  rateInPower = Math.pow((1 + monthRate), (-creditTimeMonths));
        int monthlyPayment = (int) (creditSumRub * (monthRate / (1 - rateInPower)));
        return monthlyPayment;

    }
}

