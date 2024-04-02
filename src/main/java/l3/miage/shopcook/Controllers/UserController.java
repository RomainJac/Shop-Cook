package l3.miage.shopcook.controllers;

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

    @PostMapping(path = "/add")
    public void addUser(@RequestParam UserDTO userdto) {
        User user = this.modelMapper.map(userdto, User.class);
        this.userService.save(user);
    }
}
