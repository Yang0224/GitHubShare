package com.miracle.repository;

import com.miracle.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * @author yangshaoping
 * @create 2020-07-15 20:24
 */

public interface UserReposityry extends JpaRepository<User, Long> {

    @Query("select u from User u where u.login= :login ")
    User findByLogin(@Param("login") String login);

}