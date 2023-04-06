interface Account {
    Account openAccount();
    void accountType();
}

class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("OPENED: SAVING ACCOUNT ");
        return new SavingAccount();
    }
    @Override
    public void accountType() {
        System.out.println("It is a SAVING Account");
    }
}

class CurrentAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("OPENED: CURRENT ACCOUNT ");
        return new CurrentAccount();
    }
    @Override
    public void accountType() {
        System.out.println("It is a CURRENT Account");
    }
}

abstract class Bank {
    // Композиция с реализатором
    protected Account account;
    public Bank(Account account){
        this.account = account;
    }
    abstract Account openAccount();
}

class Bank1 extends Bank {
    public Bank1(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.print("Open your account with Bank-1");
        return account;
    }
}

class Bank2 extends Bank {
    public Bank2(Account account) {
        super(account);
    }
    @Override
    Account openAccount() {
        System.out.print("Open your account with Bank12");
        return account;
    }
}

class BridgePatternMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank1(new CurrentAccount());
        Account current = bank1.openAccount();
        current.accountType(); //Open your account with Bank-1 It is a CURRENT Account
        Bank bank2 = new Bank2(new SavingAccount());
        Account saving = bank2.openAccount();
        saving.accountType(); //Open your account with Bank-2 It is a SAVING Account
    }
}