package co.com.bancolombia.service;

import co.com.bancolombia.model.User;
import co.com.bancolombia.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> getUserById(Long id) {
        return userRepository.findByIdParam(id);
    }
}