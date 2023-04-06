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

class CompositeBankAccount implements Account {
    // Коллекция счетов-потомков
    private List<Account> childAccounts = new ArrayList<Account>();
    @Override
    public void accountType() {
        for (Account account : childAccounts) {
            account.accountType();
        }
    }
    // Добавляет счет в композицию
    public void add(Account account) {
        childAccounts.add(account);
    }
    // Удаляет счет из композиции
    public void remove(Account account) {
        childAccounts.remove(account);
    }
}

class CompositePatternMain {
    public static void main(String[] args) {
        // Сберегательные счета
        SavingAccount savingAccount1 = new SavingAccount();
        SavingAccount savingAccount2 = new SavingAccount();
        // Текущие счета
        CurrentAccount currentAccount1 = new CurrentAccount();
        CurrentAccount currentAccount2 = new CurrentAccount();
        // Составной банковский счет
        CompositeBankAccount compositeBankAccount1 = new
                CompositeBankAccount();
        CompositeBankAccount compositeBankAccount2 = new
                CompositeBankAccount();
        CompositeBankAccount compositeBankAccount = new
                CompositeBankAccount();
        // Выполняем композицию банковских счетов
        compositeBankAccount1.add(savingAccount1);
        compositeBankAccount1.add(currentAccount1);
        compositeBankAccount2.add(currentAccount2);
        compositeBankAccount2.add(savingAccount2);
        compositeBankAccount.add(compositeBankAccount2);
        compositeBankAccount.add(compositeBankAccount1);
        compositeBankAccount.accountType();
    }
}