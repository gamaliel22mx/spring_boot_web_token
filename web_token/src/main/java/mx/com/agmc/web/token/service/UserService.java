package mx.com.agmc.web.token.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.agmc.web.token.repository.UserRepository;
import mx.com.agmc.web.token.entity.UserEntity;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserEntity save(UserEntity user) {
		return repository.save(user);
	}

	public UserEntity findByEmail(String email) {
		return repository.findByEmail(email);
	}
}
