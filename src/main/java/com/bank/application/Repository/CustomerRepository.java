package com.bank.application.Repository;

/*CustomerRepository oluşturunuz.
- findByIdentityNo (query yazmadan)
- findByEmail (query yazarak)
*/
import com.bank.application.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByIdentityNo(String identityNo);
    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    Customer findByEmail(String email);
}
