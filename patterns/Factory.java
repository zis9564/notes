interface Account {
    void accountType();
}

class SavingAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}

class CurrentAccount implements Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}

class AccountFactory {
    final String CURRENT_ACCOUNT = "CURRENT";
    final String SAVING_ACCOUNT  = "SAVING";

    public Account getAccount(String accountType){
        if(CURRENT_ACCOUNT.equals(accountType)) {
            return new CurrentAccount();
        }
        else if(SAVING_ACCOUNT.equals(accountType)){
            return new SavingAccount();
        }
        return null;
    }
}

class FactoryPatterMain {
    public static void main(String[] args) {
        AccountFactory accountFactory = new AccountFactory();
        Account savingAccount = accountFactory.getAccount("SAVING");
        savingAccount.accountType(); //SAVING ACCOUNT
        Account currentAccount = accountFactory.getAccount("CURRENT");
        currentAccount.accountType(); //CURRENT ACCOUNT
    }
}
