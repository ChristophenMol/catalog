package com.mysite.actual.repository;

import java.util.Optional;

import com.mysite.actual.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
  Optional<AppUser> findByEmail(String email);
}