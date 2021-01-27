package com.bankapp.service;

import java.util.List;

import com.bankapp.entities.AppUser;

public interface AppUserService {
	public List<AppUser> getAll();
	AppUser addAppUser(AppUser appUser);
	public AppUser deleteAppUser(int id);
	AppUser findByName(String name);
}
