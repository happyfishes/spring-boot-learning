package com.itea.repository.primary;

import com.itea.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @ClassName PrimaryRepository
 * @Describe
 * @create 2019-03-20 20:37
 * @Version 1.0
 **/
@Service
public interface PrimaryRepository extends MongoRepository<User, String> {
}
