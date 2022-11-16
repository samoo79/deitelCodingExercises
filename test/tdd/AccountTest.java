package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        // given
        Account owolabiAccount = new Account();
        // when i deposit 5000
        owolabiAccount.deposit (5000);
        // Account.deposit(5000);
        int owolabiAccountBalance = owolabiAccount.getBalance();
        // check that balance 5000
        assertEquals(5000, owolabiAccountBalance);




    }

    @Test
    public void depositTwiceTest() {
        // given there is an account
        Account owolabiAccount = new Account();
        //given that initial balance is 4000
        owolabiAccount.deposit(4000);
        // when i deposit 2000
        owolabiAccount.deposit(2000);
        // check that balance is 6000
        int owolabiAccountBalance = owolabiAccount.getBalance();
        assertEquals(6000, owolabiAccountBalance);
    }

    @Test
    public void depositNegativeAmountTest(){
        // given there is an account
        Account owolabiAccount = new Account();
        //given that initial balance is 4000
        owolabiAccount.deposit(4000);
        // when i deposit -2000
        owolabiAccount.deposit(-2000);
        // check that balance is 6000
        int owolabiAccountBalance = owolabiAccount.getBalance();
        assertEquals(4000, owolabiAccountBalance);





    }
    @Test
    public void normalWithdrawal (){
        // given that i have an account
        Account owolabiAccount= new Account();
        // given that i have a balance of 10000
        owolabiAccount.deposit (10000);
        // I tried to withdraw 5000 from account
        owolabiAccount.withdrawal(5000);
        // Check that balance is 5000
        int owolabiAccountBalance = owolabiAccount.getBalance();
        assertEquals(5000, owolabiAccountBalance);
    }

    @Test
    public void negativeWithdrawal(){
        // Given that i have an account
        Account samuel = new Account();
        // i have a deposit of 200000 in it
        samuel.deposit(200000);
        // i made a withdrawal of 300000
        samuel.withdrawal(300000);
        //check that the acct is balance
        int samuelAccount = samuel.getBalance();
        assertEquals(200000,samuelAccount);





    }
    @Test
    public void ZeroAccount(){
        // Given that i have an account
        Account samuel = new Account();
        // given that i have a balance of 10000
        samuel.deposit(10000);
        // I made a withdraw of 10000
        samuel.withdrawal(10000);
        // i made a withdrawal of 300000
        int samuelAccount = samuel.getBalance();
        assertEquals(0,samuelAccount );




    }

@Test
public void testForMinimumBalance(){
        // given that I have an acct
        Account samAcct = new Account();
        //when I have deposit, it deposit
        samAcct.deposit(10000);
        //when I withdraw, it must remain 1000
        samAcct.withdrawal(10000);
        //check that I cant collect more than 9000
        samAcct.getBalance();
        assertEquals(1000,samAcct.getBalance());



    }
    }