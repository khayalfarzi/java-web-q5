package az.iktlab.javawebq5.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Valute {

    private String code;
    private String nominal;
    private String name;
    private String value;
}
