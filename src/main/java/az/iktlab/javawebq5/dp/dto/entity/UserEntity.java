package az.iktlab.javawebq5.dp.dto.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    private Long id;
    private String name;
    private String surname;
    private String pass;
    private String username;
}
