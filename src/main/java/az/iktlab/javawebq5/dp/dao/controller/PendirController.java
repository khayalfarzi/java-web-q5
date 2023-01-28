package az.iktlab.javawebq5.dp.dao.controller;

import az.iktlab.javawebq5.dp.dao.model.Pendir;
import az.iktlab.javawebq5.dp.dao.service.PendirService;

public class PendirController {

    private final PendirService service = new PendirService();

    public void save(Pendir pendir) {
        service.save(pendir);
    }
}
