package com.bank.application.Repository;

/*AccountRepository oluşturunuz.
- findAllByCustomerId(query yazmadan)
- findByIbanNo(query yazarak)*/

import com.bank.application.Entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAllByCustomerId(Long customerId); //belirli musterinin tüm hesaplarını bulmak icin. parametreyle musterinin kimligi belirtilir, hesaplar liste olarak döner.

    @Query("SELECT a FROM Account a WHERE a.ibanNo = :ibanNo") //iban no'ya göre hesabı bulmak icin.
    Account findByIbanNo(String ibanNo);
}
