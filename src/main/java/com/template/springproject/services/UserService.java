package com.template.springproject.services;

import com.template.springproject.model.User;
import com.template.springproject.util.MemoryDataBase;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final MemoryDataBase memoryDataBase;

    public Observable<User> getUsers() {
        return Observable.fromIterable(memoryDataBase.findAll());
    }


    public Maybe<User> getUser (Integer userId) {
        return Maybe.create(emitter -> memoryDataBase.findById(userId));
                //.doOnError(throwable -> log.error("Error: ", throwable))
    }



    public User createUser(User user) {
        return null;
    }


    public User updateUser(User user) {
        return null;
    }


    public User patchUser(User user) {
        return null;
    }


    public User getUser() {
        return null;
    }
}
