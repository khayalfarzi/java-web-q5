package az.iktlab.javawebq5.dp.dto.repo;

import az.iktlab.javawebq5.dp.dto.entity.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private static final List<UserEntity> users = new ArrayList<>();

    public void save(UserEntity userEntity) {
        users.add(userEntity);
    }

    public List<UserEntity> getAll() {
        return users;
    }
}
