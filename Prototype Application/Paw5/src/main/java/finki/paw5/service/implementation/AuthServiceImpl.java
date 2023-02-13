package finki.paw5.service.implementation;

import finki.paw5.model.entities.User;
import finki.paw5.model.exceptions.NonExistingArgumentsException;
import finki.paw5.repository.UserRepository;
import finki.paw5.service.AuthService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;

@Service
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User login(String email, String password) {

        if(userRepository.findByEmailAndPassword(email, password)!=null){
            return userRepository.findByEmailAndPassword(email,password);
        }
        return null;
    }

    /*
    @Override
    public Adopter registerAdopter(String password, String repeatPassword, String name, String email, String telephone) {
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
    */
}
