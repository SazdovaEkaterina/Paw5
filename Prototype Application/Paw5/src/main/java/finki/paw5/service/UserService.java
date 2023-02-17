package finki.paw5.service;

import finki.paw5.model.entities.User;

import java.util.Optional;

public interface UserService {
    User register(String password, String repeatPassword, String name, String email, String telephone);

}