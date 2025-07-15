package com.example.uberclone.mapper;

import com.example.uberclone.dto.CarDTO;
import com.example.uberclone.dto.UserDTO;
import com.example.uberclone.dto.UserRequestDTO;
import com.example.uberclone.entity.Car;
import com.example.uberclone.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserMapper {

    // MAP TO ENTITY

    public static User toEntity(UserRequestDTO userRequestDTO) {
        User user = new User();

        user.setId(userRequestDTO.getId());
        user.setName(userRequestDTO.getName());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword());

        return user;

    }

    // MAP TO DTO

    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();

        List<Car> cars = user.getCars();
        List<CarDTO> carDTOS = new ArrayList<>();

        if (!cars.isEmpty()) {
            cars.forEach(car -> carDTOS.add(CarMapper.toCarDTO(car)));
            userDTO.setCar(carDTOS);
        }

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());

        return userDTO;

    }
}
