import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest{
    @Test
    public void firstName() throws UserRegistrationException{
        UserRegistration user = new UserRegistration();
        boolean result = user.firstnameTest("Akash");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void firstNameThrowsException() { //First name not proper then handle exception,using try , catch block
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.firstnameTest("akash");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void lastName() throws UserRegistrationException{
        UserRegistration user = new UserRegistration();
        boolean result = user.lastNameTest("Shevgan");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void lastNameThrowsException() { //last name not proper then handle exception,using try , catch block
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.lastNameTest("shevgan");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void email() throws UserRegistrationException{
        UserRegistration user = new UserRegistration();
        boolean result = user.emailTest("akashshevgan11@gmail.com");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void emailThrowsException() { //Email not proper then handle exception,using try , catch block
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailTest("akash.com");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void phone() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.mobileNumberTest("91 8793447817");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void mobileThrowsException() { // mobile number not proper then handle exception,using try , catch block
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.emailTest("67889");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void password() throws UserRegistrationException {
        UserRegistration user = new UserRegistration();
        boolean result = user.passwordTest("Akash123$");
        Assertions.assertEquals(true,result);
    }

    @Test
    public void passwordThrowsException() { // password not proper then handle exception,using try , catch block
        UserRegistration user = new UserRegistration();
        try {
            boolean result = user.passwordTest("hfyeinc");
            Assertions.assertTrue(result);
        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}
