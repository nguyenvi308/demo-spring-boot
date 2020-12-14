package com.nguyenvi.repository;

import org.springframework.data.repository.CrudRepository;

import com.nguyenvi.domain.User;



public interface UserRepo extends CrudRepository<User, Long> {

}
