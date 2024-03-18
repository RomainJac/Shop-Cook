package l3.miage.shopcook.services;

import l3.miage.shopcook.dto.UserDto;
import l3.miage.shopcook.entity.user.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}