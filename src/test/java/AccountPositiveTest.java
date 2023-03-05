import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountPositiveTest {
    @Test
    @DisplayName("Проверки строки с позитивным результатом")
    public void checkPositiveAccount() {
        Account account = new Account("Василий Пупкин");
        Assert.assertTrue(account.checkNameToEmboss());
    }
}
