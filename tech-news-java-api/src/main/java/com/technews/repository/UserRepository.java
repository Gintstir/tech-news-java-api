package com.technews.repository;

import org.springframework.stereotype.Repository;
import com.technews.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findUserByEmail(String email) throws Exception;

}
