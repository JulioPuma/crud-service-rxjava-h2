package com.template.springproject.util;

import com.template.springproject.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * MemoryDataBase Class. <br/>
 * Description: Simulate a sync database.
 * @author JulioPuma
 */
@Repository
public class MemoryDataBase {
    private List<User> users = new ArrayList<>();
    private Integer currentId = 1;

    public List<User> findAll() {
        return users;
    }

    public User findById(Integer id) {
        return users.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public User save(User user) {
        user.setId(currentId++);
        users.add(user);
        return user;
    }

    public void deleteById(Integer id) {
        users.removeIf(p -> p.getId().equals(id));
    }
}
