package az.iktlab.javawebq5.dp.dto.controller;

import az.iktlab.javawebq5.dp.dto.dtoo.SimpleUserDetailDto;
import az.iktlab.javawebq5.dp.dto.dtoo.UserDto;
import az.iktlab.javawebq5.dp.dto.service.UserService;

import java.util.List;

public class UserController {

    private final UserService service = new UserService();

    public void save(UserDto user) {
        service.save(user);
    }

    public List<SimpleUserDetailDto> getAll() {
        return service.findAll();
    }
}
