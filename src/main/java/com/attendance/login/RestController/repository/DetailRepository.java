package com.attendance.login.RestController.repository;


import com.attendance.login.RestController.model.Details;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface DetailRepository extends CrudRepository<Details,Integer> {

     Details findByName(String name);

     Details findByEmail(String email);

}
