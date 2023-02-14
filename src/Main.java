public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditSumRub = 1_000_000;
        int creditTimeMonths = 36;
        double yearRate = 9.99;
        int monthlyPayment = service.calculate(creditSumRub, creditTimeMonths, yearRate);
        System.out.println(monthlyPayment);

    }
}