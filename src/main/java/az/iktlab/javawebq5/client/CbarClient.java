package az.iktlab.javawebq5.client;

import az.iktlab.javawebq5.client.model.Root;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cbar-api",
        url = "https://api.opendata.az/v2/az/json/centralBank/economic")
public interface CbarClient {

    @GetMapping("/currencies")
    Root getCurrencies();
}
