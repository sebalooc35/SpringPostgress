package org.backendada.springpostgress.user.controller;

import org.backendada.springpostgress.user.dto.UserDto;
import org.backendada.springpostgress.user.exception.UserNotFoundException;
import org.backendada.springpostgress.user.model.User;
import org.backendada.springpostgress.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    User createUser(@RequestBody UserDto userDto) {
        User user = new User(userDto);
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    User findById(@PathVariable Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isPresent())
            return optionalUser.get();
        else throw new UserNotFoundException(id);
    }

}
