package az.iktlab.javawebq5.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root {

    private List<ValuteType> valuteTypes = new ArrayList<>();

}
