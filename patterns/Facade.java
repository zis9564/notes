class PaymentService {
    public static boolean doPayment() {
        return true;
    }
}

class AccountService {
    public static Account getAccount(String accountId) {
        return new SavingAccount();
    }
}

class TransferService {
    public static void transfer(int amount, Account fromAccount,
                                Account toAccount) {
        System.out.println("Transfering Money");
    }
}

interface BankingServiceFacade {
    void moneyTransfer();
}

class BankingServiceFacadeImpl implements BankingServiceFacade {
    @Override
    public void moneyTransfer() {
        if(PaymentService.doPayment()){
            Account fromAccount = AccountService.getAccount("1");
            Account toAccount   = AccountService.getAccount("2");
            TransferService.transfer(1000, fromAccount, toAccount);
        }
    }
}

class FacadePatternClient {
    public static void main(String[] args) {
        BankingServiceFacade serviceFacade = new
                BankingServiceFacadeImpl();
        serviceFacade.moneyTransfer();
    }
}