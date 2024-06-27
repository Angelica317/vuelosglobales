package com.campus.vuelosglobales.revision.application.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.campus.vuelosglobales.revision.domain.entities.Revision;
import com.campus.vuelosglobales.revision.domain.repositories.RevisionRepository;

@Service
public class RevisionService {
    private final RevisionRepository revisionRepository;

    public RevisionService(RevisionRepository revisionRepository) {
        this.revisionRepository = revisionRepository;
    }

    public List<Revision> findAll() {
        return revisionRepository.findAll();
    }

    public Revision findById(Long id) {
        return revisionRepository.findById(id).orElse(null);
    }

    public Revision save(Revision revision) {
        return revisionRepository.save(revision);
    }

    public void deleteById(Long id) {
        revisionRepository.deleteById(id);
    }
}