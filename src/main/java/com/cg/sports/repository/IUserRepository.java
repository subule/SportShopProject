package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.sports.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

}
