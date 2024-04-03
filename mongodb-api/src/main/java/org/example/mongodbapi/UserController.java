package org.example.mongodbapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private final Logger LOG = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> findAll() {
        LOG.info("Getting all users");
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findOne(@PathVariable String id) {
        LOG.info("Getting user by ID");
        return userRepository.findById(id);
    }

    @PostMapping("/create")
    public User addNewUsers(@RequestBody User user) {
        LOG.info("Saving user.");
        return userRepository.save(user);
    }
}
