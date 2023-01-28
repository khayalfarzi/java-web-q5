package az.iktlab.javawebq5.dp.dao.repository;

import az.iktlab.javawebq5.dp.dao.model.Pendir;

import java.util.ArrayList;
import java.util.List;

public class PendirRepository {

    private static final List<Pendir> soyuducu = new ArrayList<>();

    public void save(Pendir pendir) {
        soyuducu.add(pendir);
    }
}
