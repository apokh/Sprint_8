import org.junit.Assert;
import org.junit.Test;

public class AccountPositiveTest {
    @Test
    public void checkPositiveAccount() {
        Account account = new Account("Василий Пупкин");
        Assert.assertTrue(account.checkNameToEmboss());
    }
}
