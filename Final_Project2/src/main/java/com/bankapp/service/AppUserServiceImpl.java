package com.bankapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.entities.Account;
import com.bankapp.entities.AppUser;
import com.bankapp.exceptions.ResourseNotFondException;
import com.bankapp.repo.AppUserRepo;
@Service
@Transactional
public class AppUserServiceImpl implements AppUserService{
	
	private AppUserRepo appUserRepo;
	@Autowired
	public AppUserServiceImpl(AppUserRepo appUserRepo) {
		this.appUserRepo = appUserRepo;
	}

	@Override
	public List<AppUser> getAll() {
	return appUserRepo.findAll();
	}

	@Override
	public AppUser addAppUser(AppUser appUser) {
		appUserRepo.save(appUser);
		return appUser;
	}

	@Override
	public AppUser deleteAppUser(int id) {
		AppUser appUser=appUserRepo.findById(id).orElseThrow(()->new ResourseNotFondException("user with id :"+id+"not found"));
		appUserRepo.delete(appUser);
		return appUser;
	
	}

	@Override
	public AppUser findByName(String name) {
		
		return appUserRepo.findByName(name);
	}

}
