package com.example.FashionStore.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FashionStore.Entity.Login;
import com.example.FashionStore.Exception.ResourceNotFoundException;
import com.example.FashionStore.Repository.LoginRepo;
import com.example.FashionStore.Service.LoginService;

@Service
public class LoginServiceimpl implements LoginService{

	@Autowired
	LoginRepo loginrepo;
	@Override
	public Login login(String email, String password) {
		// TODO Auto-generated method stub
		Login s=loginrepo.findByEmail(email);
		if (s != null) {
			if (s.getPassword().equals(password)) {
				return s;
			} else {
				throw new ResourceNotFoundException();
			}
		} else {
			throw new ResourceNotFoundException();
		}

	}

}
