package com.hanghae99.preonboardingbackend.model.repository;

import com.hanghae99.preonboardingbackend.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
