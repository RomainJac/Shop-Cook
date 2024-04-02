package l3.miage.shopcook.controllers;

import l3.miage.shopcook.user.User;
import l3.miage.shopcook.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import l3.miage.shopcook.services.UserService;
import l3.miage.shopcook.user.User;
import l3.miage.shopcook.user.UserDTO;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;
     @Autowired
    ModelMapper modelMapper;


    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public boolean createUser(@RequestBody User user) {
        return userService.save(user);
    }


    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }

    
  
    @PostMapping(path = "/add")
    public void addUser(@RequestParam UserDTO userdto) {
        User user = this.modelMapper.map(userdto, User.class);
        this.userService.save(user);
    }
}
