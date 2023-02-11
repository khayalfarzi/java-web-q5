package az.iktlab.javawebq5.controller;

import az.iktlab.javawebq5.model.EducationDto;
import az.iktlab.javawebq5.service.EducationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/education")
public class EducationController {

    private final EducationService service;

    public EducationController(EducationService service) {
        this.service = service;
    }

    @PostMapping
    public void add(@RequestBody EducationDto education) {
        service.add(education);
    }

    @PutMapping
    public void update(EducationDto education) {
        service.update(education);
    }

    @GetMapping
    public List<EducationDto> getAll() {
        return service.getAll();
    }
}
