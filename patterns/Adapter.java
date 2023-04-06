interface PaymentGateway {
    void doPayment(Account account1, Account account2);
}

class PaymentGatewayImpl implements PaymentGateway {
    @Override
    public void doPayment(Account account1, Account account2){
        System.out.println("Do payment using Payment Gateway");
    }
}

interface AdvancedPayGateway {
    void makePayment(String mobile1, String mobile2);
}

class AdvancedPaymentGatewayAdapter implements AdvancedPayGateway {
    private PaymentGateway paymentGateway;
    public AdvancedPaymentGatewayAdapter(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void makePayment(String mobile1, String mobile2) {
        // получаем номер счета по номеру мобильного телефона
        Account account1 = null;
        Account account2 = null;
        paymentGateway.doPayment(account1, account2);
    }
}

class AdapterPatternMain {
    public static void main(String[] args) {
        PaymentGateway paymentGateway = new PaymentGatewayImpl();
        AdvancedPayGateway advancedPayGateway = new AdvancedPaymentGatewayAdapter(paymentGateway);
        String mobile1 = null;
        String mobile2 = null;
        advancedPayGateway.makePayment(mobile1, mobile2); //Do payment using Payment Gateway
    }
}