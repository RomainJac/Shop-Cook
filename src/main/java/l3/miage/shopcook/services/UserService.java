package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.stereotype.Service;

import l3.miage.shopcook.user.User;

@Service
public interface UserService {
    boolean save(User user);

    boolean delete(User user);

    boolean update(User user);

    User findById(long id);

    List<User> findAll();

    User deleteById(long id);

    User findByUsername(String username);

}
