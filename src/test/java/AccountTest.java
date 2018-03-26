package test.java;
import main.java.com.thoughtworks.bank.Account;
import main.java.com.thoughtworks.bank.MinimumBalanceException;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class AccountTest {
    private Account account;
    @Before
    public void setUp() throws Exception {
        account = new Account("1234-1234","Anjum K",1000);
    }
    @Test
    public void getBalance(){
        assertEquals(account.getBalance(),1000);
    }

    @Test(expected = MinimumBalanceException.class)
    public void checkMinimumBalance() throws MinimumBalanceException {
        new Account("1234-1234","Anjum K",900);
    }

    @Test
    public void getAccountNumber(){
        assertThat(account.getAccountNumber(),is("1234-1234"));
    }

}
