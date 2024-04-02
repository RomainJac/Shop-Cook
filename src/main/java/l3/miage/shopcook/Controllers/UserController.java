package l3.miage.shopcook.controllers;

import l3.miage.shopcook.dto.UserDTO;
import l3.miage.shopcook.user.User;
import l3.miage.shopcook.services.UserService;
import l3.miage.shopcook.mappers.UserMapper;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {
        List<User> users = userService.findAll();
        return users.stream().map(userMapper::toDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        User user = userService.findById(id);
        return userMapper.toDTO(user);
    }

    @PostMapping(path = "add")
    public boolean createUser(@RequestBody UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        return userService.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
