package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.yash.model.User;

@Repository
public interface Registerrepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String email);

	public User findByEmailIdAndPassword(String email, String password);

	

}
