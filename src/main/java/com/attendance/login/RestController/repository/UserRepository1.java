package com.attendance.login.RestController.repository;


import com.attendance.login.RestController.model.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface UserRepository1 extends JpaRepository<User1,Integer> {
    @Query("select u from User1 u where u.email = ?1")
    public List<User1> findByEmail(String email);

   List<User1> getByDate(LocalDate date);

    List<User1> findByName(String name);

    //    @Query(nativeQuery = true, value="select *from asd where date='2022-06-08'")
//    List<User> getData(@Param("date")LocalDate date);
}
