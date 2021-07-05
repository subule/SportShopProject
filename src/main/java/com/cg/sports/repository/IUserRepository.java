package com.cg.sports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sports.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}
