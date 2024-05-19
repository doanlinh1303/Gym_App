package nhom9.gym.controller;

import nhom9.gym.entity.User;
import nhom9.gym.service.user.UserService;
import nhom9.gym.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {
    @Autowired
 private UserServiceImpl userService;
 @PostMapping("/add")
    public ResponseEntity<?> add (@RequestBody User user){
     return userService.save(user);
 }
}
