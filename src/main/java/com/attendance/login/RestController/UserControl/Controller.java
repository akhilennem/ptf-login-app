package com.attendance.login.RestController.UserControl;

import com.attendance.login.RestController.model.Details;
import com.attendance.login.RestController.model.User1;
import com.attendance.login.RestController.repository.DetailRepository;
import com.attendance.login.RestController.repository.UserRepository1;
import com.attendance.login.RestController.services.DetailsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/rest")
public class Controller {

    @Autowired
    private DetailRepository detailRepository;

    @Autowired
    public UserRepository1 userRepository1;
    public String verify = "confirm";
    @Autowired
    public DetailsServices detailService;

    @PostMapping("/save")
    public ResponseEntity AddUser( User1 user1) {
        if (verify.equals(user1.para)) {
            userRepository1.save(user1);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get-user-details")
    public Iterable<User1> take( String email) {
        return userRepository1.findByEmail(email);
    }

    @GetMapping("/get-by-date")
    public Iterable<User1> findByDate(@RequestParam String date) {
        return userRepository1.getByDate(LocalDate.parse(date));
    }

    @PutMapping("/update-profile")
    public Details profile(@RequestBody Details details) {
        return detailRepository.save(details);
    }

    @GetMapping("/get-profile")
    public Details getProfileByEmail(@RequestParam String email) {
        return detailService.Find(email);
    }

    @GetMapping("/recent")
    public Iterable<User1> find() {
        return userRepository1.getByDate(LocalDate.now());
    }

}
