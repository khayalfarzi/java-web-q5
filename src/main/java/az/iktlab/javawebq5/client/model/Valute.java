package az.iktlab.javawebq5.client.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "This model help us to convert data incoming from cbar and show us important data")
public class Valute {

    @ApiModelProperty(name = "Valute code", example = "USD")
    private String code;

    @ApiModelProperty(name = "Valute nominal", example = "1 u.t")
    private String nominal;

    @ApiModelProperty(name = "Valute name", example = "Abş dolları")
    private String name;

    @ApiModelProperty(name = "Valute value", example = "1.7234")
    private String value;
}
