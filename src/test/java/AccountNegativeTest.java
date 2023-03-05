import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNegativeTest {
    String name;

    public AccountNegativeTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {"F "},
                {"Qwe"},
                {" we"},
                {" QwertyuiopAsdfghjf"},
                {"Qw "},
                {"QwertyuiopAsdfghaj "},
                {"Qwertyuiop Asdfghjkl"},
                {"Qwer Yuiop Asdfghjk"}
        };
    }

    @Test
    public void checkNegativeAccount() {
        Account account = new Account(name);
        Boolean result = account.checkNameToEmboss();
        Assert.assertFalse(result);
    }
}
