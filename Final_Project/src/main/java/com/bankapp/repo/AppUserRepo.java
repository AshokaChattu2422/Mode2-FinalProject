package com.bankapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.entities.AppUser;


@Repository
public interface AppUserRepo extends JpaRepository<AppUser, Integer>{

	AppUser findByName(String name);
}
