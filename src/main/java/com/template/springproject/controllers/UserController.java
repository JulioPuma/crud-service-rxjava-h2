package com.template.springproject.controllers;

import com.template.springproject.model.User;
import com.template.springproject.services.UserService;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public Observable<User> getUsers() {

        return null;
    }

    @GetMapping("/{userId}")
    public Maybe<User> getUser (
            @PathVariable Integer userId) {

        return null;
    }

    @PostMapping("")
    public Single<User> createUser(
            @RequestBody User user) {
        return null;
    }

    @PutMapping("")
    public Maybe<User> updateUser(
            @RequestBody User user) {
        return null;
    }

    @PatchMapping("")
    public Maybe<User> patchUser(
            @RequestBody User user) {
        return null;
    }

    @DeleteMapping("/{userId}")
    public Completable getUser() {
        return null;
    }
}
