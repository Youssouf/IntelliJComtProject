package com.yss;

import java.math.BigDecimal;

/**
 * Created by yss on 29-04-2016.
 */
public class Account {
    private  String name;
    private  BigDecimal amount;

    public Account(String name, String amount) {
        this.name = name;
        this.amount = new BigDecimal(amount);
        this.amount.setScale(2,BigDecimal.ROUND_HALF_UP);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = new BigDecimal(amount);
    }
    @Override
    public  String toString()
    {
        return  "Account Name " + this.getName() + "\n Amount " + this.getAmount();
    }
    public  void  withdraw(String withdrawAmount)
    {
        BigDecimal  myMouner = new BigDecimal(withdrawAmount);

        if ( myMouner.compareTo(BigDecimal.ZERO) < 0 )
        {
            throw  new  IllegalArgumentException();
        }
        // if the  amount is less than decired amount  throw an illegalArgumentException.
        if (this.getAmount().compareTo(myMouner) < 0)
        {
             throw new  IllegalArgumentException();

        }
        this.setAmount((this.getAmount().subtract(myMouner)).toString());

    }

}
