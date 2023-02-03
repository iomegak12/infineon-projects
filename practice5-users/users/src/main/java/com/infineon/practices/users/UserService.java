package com.infineon.practices.users;


public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}