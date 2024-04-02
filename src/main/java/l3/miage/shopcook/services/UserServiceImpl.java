package l3.miage.shopcook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import l3.miage.shopcook.repositories.UserRepository;
import l3.miage.shopcook.user.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public boolean save(User user) {
       try {

           this.userRepository.save(user);
           return true;

       }
         catch (Exception e) {
              return false;
         }
    }

    @Override
    public boolean delete(User user) {
       try {
        this.userRepository.delete(user);
        return true;
       }
         catch (Exception e) {
              return false;
         }
    }

    @Override
    public boolean update(User user) {
 
        if (this.userRepository.existsById(user.getId())) {
            this.delete(user);
            this.save(user);
            return true;
        }
        return false;
    }

    @Override
    public User findById(long id) {
     return this.userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }
    @Override
    public User deleteById(long id) {
        return this.userRepository.deleteById(id);
    }
}
