package az.iktlab.javawebq5.dp.dto.dtoo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String name;
    private String surname;
    private String pass;
    private String uname;
}
