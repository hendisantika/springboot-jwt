package com.hendisantika.springbootjwt.repository;

import com.hendisantika.springbootjwt.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jwt
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-08-11
 * Time: 05:12
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
