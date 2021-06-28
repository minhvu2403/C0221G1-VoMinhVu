package com.example.codegym.repository;

import com.example.codegym.model.PersonalCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalCodeRepository extends JpaRepository<PersonalCode,Integer> {
    PersonalCode findByCodeForBook(String code);
}
