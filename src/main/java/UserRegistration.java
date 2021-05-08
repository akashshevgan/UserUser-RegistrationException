import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstnameTest(String firstname) throws UserRegistrationException{
        boolean test = Pattern.compile("(^[A-Z]{1}[a-z]{2,20}$)").matcher(firstname).matches();
        if (test) {
            System.out.println(firstname + " First name is valid");
            return true;
        } else {
            throw new UserRegistrationException(firstname + " First name is invalid");
        }
    }

    public boolean lastNameTest(String lastname) throws UserRegistrationException {
        boolean test = Pattern.compile("(^[A-Z]{1}[a-z]{2,20}$)").matcher(lastname).matches();
        if (test) {
            System.out.println(lastname + " lastname is Valid ");
            return true;
        } else {
            throw new UserRegistrationException(lastname + " lastname is Invalid ");
        }
    }

    public boolean emailTest(String email) throws UserRegistrationException{
        boolean test = Pattern.compile("(^[a-z 0-9]{0,30} *([.+/-]?[a-z 0-9]{1,20})@[a-z]{1,20}.([a-z]{2,3} *(.[a-z]{2,3}))$)").matcher(email).matches();
        if (test) {
            System.out.println(email + " email is Valid ");
            return true;
        } else {
            throw new UserRegistrationException(email + " email is Invalid ");
        }
    }

    public boolean mobileNumberTest(String phone) throws UserRegistrationException{
        boolean test = Pattern.compile("^[0-9]{2}\\s[0-9]{10}").matcher(phone).matches();
        if (test) {
            System.out.println(phone + " mobile number is Valid ");
            return true;
        } else {
            throw new UserRegistrationException(phone + " mobile number is Invalid ");
        }
    }

    public boolean  passwordTest (String password) throws UserRegistrationException{
        boolean test = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*()_+=-]?){8,32}.*$").matcher(password).matches();
        if (test) {
            System.out.println (password + " password is Valid ");
            return true;
        } else {
            throw new UserRegistrationException(password + " password is Invalid ");
        }
    }
}
