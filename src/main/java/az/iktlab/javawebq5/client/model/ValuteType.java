package az.iktlab.javawebq5.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValuteType {

    private String type;
    private List<Valute> valutes = new ArrayList<>();

}
