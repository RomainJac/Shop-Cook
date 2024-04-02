package l3.miage.shopcook.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import l3.miage.shopcook.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsById(long id);

    User deleteById(long id);

    User findById(long id);

    User findByUsername(String username);
}
