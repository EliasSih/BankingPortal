package dev.elisih.bankPortal;

import dev.elisih.bankPortal.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

    // Using Spring Data MongoDB @Query annotation to define the query
    @Query("{ 'accountNumber' : ?0 }")
    Account findByAccountNumber(String accountNumber);
}
