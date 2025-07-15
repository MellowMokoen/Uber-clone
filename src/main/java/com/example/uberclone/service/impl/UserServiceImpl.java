package com.example.uberclone.service.impl;

import com.example.uberclone.dto.UserDTO;
import com.example.uberclone.dto.UserLoginRequestDTO;
import com.example.uberclone.dto.UserRequestDTO;
import com.example.uberclone.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDTO register(UserRequestDTO userRequestDTO) {
        return null;
    }

    @Override
    public UserDTO login(UserLoginRequestDTO userLoginRequestDTO) {
        return null;
    }

    @Override
    public UserDTO getUserById(Integer id) {
        return null;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
