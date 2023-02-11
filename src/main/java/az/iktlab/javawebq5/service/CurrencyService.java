package az.iktlab.javawebq5.service;

import az.iktlab.javawebq5.client.CbarClient;
import az.iktlab.javawebq5.client.model.Valute;
import az.iktlab.javawebq5.client.model.ValuteType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CurrencyService {

    private final CbarClient client;

    public CurrencyService(CbarClient client) {
        this.client = client;
    }

    public List<Valute> getCurrencies() {
        return getValutesFromCbar();
    }

    public Valute getCurrencyByCode(String code) {
        return getValutesFromCbar()
                .stream()
                .filter(it -> it.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("VALUTE_NOT_FOUND"));
    }

    private List<Valute> getValutesFromCbar() {
        var currencies = client.getCurrencies();

        var valutes = new ArrayList<Valute>();

        for (ValuteType valuteType : currencies.getValuteTypes()) {
            valutes.addAll(valuteType.getValutes());
        }

        return valutes;
    }
}
