/**
 * Copyright (C), 2015-2017
 * FileName: UserRepositoty
 * Author:   YangShaoping
 * Date:     2017/8/18 11:35
 * Description: 持久层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.basic.repositoty;

import com.basic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 〈持久层〉
 *
 * @author YangShaoping
 * @create 2017/8/18
 * @since 1.0.0
 */
public interface UserRepositoty extends JpaRepository<User, Long>{

    @Query("select u from User u where name = :name ")
    User findByName(@Param("name") String name);

    @Query(value = "select u.* from user u left join user u2 on u.parent_id=u2.id", nativeQuery = true)
    List findAll();

}