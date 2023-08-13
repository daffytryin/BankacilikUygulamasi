
/*Account:
- id,
- customerId,
- ibanNo,
- currentBalance,
*/

package com.bank.application.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customerId;
    private String ibanNo;
    private Double currentBalance;
    private CurrencyTypeEnum currencyTypeEnum;
    private AccountTypeEnum accountTypeEnum;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setIbanNo(double ibanNo) {
        this.ibanNo = String.valueOf(ibanNo);
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public void setCurrencyTypeEnum(CurrencyTypeEnum currencyTypeEnum) {
        this.currencyTypeEnum = currencyTypeEnum;
    }

    public void setAccountTypeEnum(AccountTypeEnum accountTypeEnum) {
        this.accountTypeEnum = accountTypeEnum;
    }


}