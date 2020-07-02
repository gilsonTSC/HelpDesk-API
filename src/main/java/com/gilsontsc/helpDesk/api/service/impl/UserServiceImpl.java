package com.gilsontsc.helpDesk.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.gilsontsc.helpDesk.api.entity.User;
import com.gilsontsc.helpDesk.api.repository.UserRepository;
import com.gilsontsc.helpDesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		return this.userRepository.findById(id).get();
	}

	@Override
	public void delete(String id) {
		this.userRepository.deleteById(id);
	}

	@Override
	public Page<User> findAll(int page, int count) {
		Sort sort = Sort.by(Sort.Direction.DESC, "date");
		PageRequest pages = PageRequest.of(page, count, sort);
		return this.userRepository.findAll(pages);
	}

}