public interface Combinator extends Function<Person, Status> {

    //vlidation field name
    static Combinator isNameCorrect() {
        return person -> person.getName().length() > 2 ? CORRECT : NAME_IS_NOT_CORRECT;
    }
    //vlidation field phone
    static Combinator isPhoneCorrect() {
        return person -> person.getPhone().contains("+") ? CORRECT : PHONE_NOT_CORRECT;
    }
    //vlidation field email
    static Combinator isEmailCorrect() {
        return person -> person.getEmail().contains("@") ? CORRECT : EMAIL_NOT_CORRECT;
    }
    //vlidation field birthDate
    static Combinator isAdult() {
        return person -> Period.between(person.getBirthDate(), LocalDate.now()).getYears() > 18 ? CORRECT : IS_NOT_ADULT;
    }

    //Combinator implementtion
    default Combinator and(Combinator other) {
        return person -> {
            Status status = this.apply(person);
            return status.equals(CORRECT) ?
                    other.apply(person) : status;
        };
    }

    enum Status {
        CORRECT, NAME_IS_NOT_CORRECT, EMAIL_NOT_CORRECT, PHONE_NOT_CORRECT, IS_NOT_ADULT;
    }
}

public class Person {
    private final String name;
    private final String phone;
    private final String email;
    private final LocalDate birthDate;

    public Person(String name, String phone, String email, LocalDate birthDate) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
    }
    public String getName() {return name;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}
    public LocalDate getBirthDate() {return birthDate;}
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person(
                "John", 
                "+012345", 
                "zic@mail.com", 
                LocalDate.of(1999, 3, 15));
        Combinator.Status result = Combinator.isNameCorrect()
                .and(Combinator.isPhoneCorrect())
                .and(Combinator.isEmailCorrect())
                .and(Combinator.isAdult())
                .apply(person);
        System.out.println(result);
    }
}