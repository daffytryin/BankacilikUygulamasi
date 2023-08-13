package com.bank.application.Services;

/*Account entity için service*/

import com.bank.application.Entities.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAllByCustomerId(Long customerId);

    Account findByIbanNo(String ibanNo);

    Account save(Account account);

    void delete(Long id);

    Account withdrawMoney(String ibanNo, Double amount);

    Account depositMoney(String ibanNo, Double amount);
}