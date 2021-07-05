package com.codegym.login.repository;

import com.codegym.login.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser ,Long> {
    AppUser findByUserName(String userName);
}
