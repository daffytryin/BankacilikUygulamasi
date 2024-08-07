package com.bank.application.Services;

/*implements kullanarak service kullanımı sağlanır*/

import com.bank.application.Entities.Account;
import com.bank.application.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> findAllByCustomerId(Long customerId) {
        return accountRepository.findAllByCustomerId(customerId);
    }

    @Override
    public Account findByIbanNo(String ibanNo) {
        return accountRepository.findByIbanNo(ibanNo);
    }

    @Override
    public Account save(Account account) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Account withdrawMoney(String ibanNo, Double amount) {
        return null;
    }

    @Override
    public Account depositMoney(String ibanNo, Double amount) {
        return null;
    }
}
