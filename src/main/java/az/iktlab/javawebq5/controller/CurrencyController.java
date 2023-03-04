package az.iktlab.javawebq5.controller;

import az.iktlab.javawebq5.client.model.Valute;
import az.iktlab.javawebq5.service.CurrencyService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    private final CurrencyService service;

    public CurrencyController(CurrencyService service) {
        this.service = service;
    }

    @GetMapping
    @Operation(summary = "Get currencies from CBAR",
            description = "This endpoint help us to get currencies from CBAR client")
    public List<Valute> getCurrencies() {

        return service.getCurrencies();
    }

    @GetMapping("/code/{code}")
    @PreAuthorize("hasRole('ROLE_MODERATOR')")
    public Valute getCurrencyByCode(@PathVariable String code) {
        return service.getCurrencyByCode(code);
    }
}
