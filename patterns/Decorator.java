interface Account {
    String getTotalBenefits();
}

class SavingAccount implements Account {
    @Override
    public String getTotalBenefits() {
        return "This account has 4% interest rate with per day $5000 withdrawal limit";
    }
}

class CurrentAccount implements Account {
    @Override
    public String getTotalBenefits() {
        return "There is no withdrawal limit for current account";
    }
}

abstract class AccountDecorator implements Account {
    abstract String applyOtherBenefits();
}

class SeniorCitizen extends AccountDecorator {
    Account account;

    public SeniorCitizen(Account account) {
        super();
        this.account = account;
    }

    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are " +applyOtherBenefits();
    }

    String applyOtherBenefits() {
        return " an medical insurance of up to $1,000 for Senior Citizen "; }
    }
}

class Privilege extends AccountDecorator {
    Account account;
    public Privilege(Account account) {
        this.account = account;
    }
    public String getTotalBenefits() {
        return account.getTotalBenefits() + " other benefits are " +applyOtherBenefits();
    }
    String applyOtherBenefits() {
        return " an accident insurance of up to $1,600 and an overdraft facility of $84";
    }
}

class DecoratorPatternMain {
    public static void main(String[] args) {
        /* Сберегательный счет без декорации */
        Account basicSavingAccount = new SavingAccount();
        System.out.println(basicSavingAccount.getTotalBenefits());
     /* Сберегательный счет с декорацией в виде акционной схемы для пенсионеров */
        Account seniorCitizenSavingAccount = new SavingAccount();
        seniorCitizenSavingAccount = new
                SeniorCitizen(seniorCitizenSavingAccount);
        System.out.println
                (seniorCitizenSavingAccount.getTotalBenefits());
     /* Сберегательный счет с декорацией в виде акционной схемы для VIP-вкладчиков */
        Account privilegeCitizenSavingAccount = new SavingAccount();
        privilegeCitizenSavingAccount = new
                Privilege(privilegeCitizenSavingAccount);
        System.out.println
                (privilegeCitizenSavingAccount.getTotalBenefits());
    }
}