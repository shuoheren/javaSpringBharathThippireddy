package com.example.studentdal.repos;

import com.example.studentdal.entities.User;
import org.springframework.data.repository.CrudRepository;
public interface UserRepository extends CrudRepository<User, String> {


}
