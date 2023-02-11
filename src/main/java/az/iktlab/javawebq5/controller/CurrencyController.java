package az.iktlab.javawebq5.controller;

import az.iktlab.javawebq5.client.model.Valute;
import az.iktlab.javawebq5.service.CurrencyService;
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
    public List<Valute> getCurrencies() {

        return service.getCurrencies();
    }

    @GetMapping("/code/{code}")
    public Valute getCurrencyByCode(@PathVariable String code) {
        return service.getCurrencyByCode(code);
    }
}
