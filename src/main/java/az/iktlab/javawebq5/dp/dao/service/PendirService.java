package az.iktlab.javawebq5.dp.dao.service;

import az.iktlab.javawebq5.dp.dao.model.Pendir;
import az.iktlab.javawebq5.dp.dao.repository.PendirRepository;

public class PendirService {

    private static final PendirRepository repo = new PendirRepository();

    public void save(Pendir pendir) {

        if (pendir.getName().equalsIgnoreCase("Motal")) {
            throw new RuntimeException("Zeherlene bilerik");
        }

        // validation must be here
        repo.save(pendir);
    }
}
