package com.ajish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ajish.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserId(int id);

}
