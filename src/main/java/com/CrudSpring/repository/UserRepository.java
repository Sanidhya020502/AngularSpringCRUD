package com.CrudSpring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.CrudSpring.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
