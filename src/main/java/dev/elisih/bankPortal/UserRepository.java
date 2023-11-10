package dev.elisih.bankPortal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    boolean existsByUsername(String username);
    // You can define other methods as needed
}
