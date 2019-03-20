package com.itea.repository.secondary;

import com.itea.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * @ClassName SecondaryRepository
 * @Describe
 * @create 2019-03-20 20:37
 * @Version 1.0
 **/
@Service
public interface SecondaryRepository extends MongoRepository<User, String> {
}
