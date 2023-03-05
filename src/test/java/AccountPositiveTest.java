import jdk.jfr.Description;
import org.junit.Assert;
import org.junit.Test;

public class AccountPositiveTest {
    @Test
    @Description("Проверки строки с позитивным результатом")
    public void checkPositiveAccount() {
        Account account = new Account("Василий Пупкин");
        Assert.assertTrue(account.checkNameToEmboss());
    }
}
