package Project.BankApp.Repositories;

import Project.BankApp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {
    List<User> findByEmail(String email);
}
