package mx.com.agmc.web.token.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.agmc.web.token.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long>{

	UserEntity save(UserEntity user);

	UserEntity findByEmail(String email);
}
