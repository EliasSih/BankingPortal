package dev.elisih.bankPortal;
import dev.elisih.bankPortal.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<String> allUser (){
        return new ResponseEntity<String>("All Users", HttpStatus.OK);
    }

}



