abstract class Account implements Cloneable {
    abstract public void accountType();

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

class CurrentAccount extends Account {
    @Override
    public void accountType() {
        System.out.println("CURRENT ACCOUNT");
    }
}

class SavingAccount extends Account {
    @Override
    public void accountType() {
        System.out.println("SAVING ACCOUNT");
    }
}

class AccountCache {
    public static Map<String, Account> accountCacheMap = new HashMap<>();

    static {
        Account currentAccount = new CurrentAccount();
        Account savingAccount = new SavingAccount();
        accountCacheMap.put("CURRENT", currentAccount);
        accountCacheMap.put("SAVING", savingAccount);
    }
}

class PrototypePatternMain {
    public static void main(String[] args) {
        Account currentAccount = (Account)
                AccountCache.accountCacheMap.get("CURRENT").clone();
        currentAccount.accountType();
        Account savingAccount = (Account)
                AccountCache.accountCacheMap.get("SAVING") .clone();
        savingAccount.accountType();
    }
}
