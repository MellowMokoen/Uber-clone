package com.example.uberclone.service;

import com.example.uberclone.dto.UserDTO;
import com.example.uberclone.dto.UserLoginRequestDTO;
import com.example.uberclone.dto.UserRequestDTO;

import java.util.List;

public interface UserService {

    public UserDTO register(UserRequestDTO userRequestDTO);
    public UserDTO login(UserLoginRequestDTO userLoginRequestDTO);
    public UserDTO getUserById(Integer id);
    public List<UserDTO> getAllUsers();
}
