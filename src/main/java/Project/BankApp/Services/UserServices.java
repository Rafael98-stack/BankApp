package Project.BankApp.Services;

import Project.BankApp.Dtos.UserDtos.UserRegisterDto;
import Project.BankApp.Entities.User;
import Project.BankApp.Repositories.UserDAO;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    private final UserDAO userDAO;

    public UserServices(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void registerUser(UserRegisterDto userRegisterDto){
        User user = new User(
                userRegisterDto.nome(),
                userRegisterDto.cognome(),
                userRegisterDto.email(),
                userRegisterDto.numero_telefono(),
                userRegisterDto.indirizzo(),
                userRegisterDto.data_nascita()
        );
        userDAO.save(user);
    }

    public
}
