package finki.paw5.service.implementation;

import finki.paw5.model.entities.User;
import finki.paw5.repository.UserRepository;
import finki.paw5.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User register(String password, String repeatPassword, String name, String email, String telephone) {
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            //throw new Exception();
        }
        if (!password.equals(repeatPassword)) {
            //throw new Exception();
        }
       if (this.userRepository.findByEmail(email)!=null) {
            //throw new Exception("Username exists:"+email);
        }
        User user = new User(LocalDate.now(), name, email, password, telephone);
        return userRepository.save(user);
    }

}
