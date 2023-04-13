interface Account {
    void accountType();
}

class SavingAccount implements Account {
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}

class ProxySavingAccount implements Account{
    private Account savingAccount;
    public void accountType() {
        if(savingAccount == null){
            savingAccount = new SavingAccount();
        }
        savingAccount.accountType();
    }
}
