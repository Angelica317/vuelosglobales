package com.campus.vuelosglobales.revision.infrastructure.adapters.input;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.campus.vuelosglobales.revision.application.Services.RevisionService;
import com.campus.vuelosglobales.revision.domain.entities.Revision;

@RestController
@RequestMapping("/revisions")
public class RevisionController {
    private final RevisionService revisionService;

    public RevisionController(RevisionService revisionService) {
        this.revisionService = revisionService;
    }

    @GetMapping
    public List<Revision> getAllRevisions() {
        return revisionService.findAll();
    }

    @GetMapping("/{id}")
    public Revision getRevisionById(@PathVariable Long id) {
        return revisionService.findById(id);
    }

    @PostMapping
    public Revision createRevision(@RequestBody Revision revision) {
        return revisionService.save(revision);
    }

    @PutMapping("/{id}")
    public Revision updateRevision(@PathVariable Long id, @RequestBody Revision revision) {
        revision.setId(id);
        return revisionService.save(revision);
    }

    @DeleteMapping("/{id}")
    public void deleteRevision(@PathVariable Long id) {
        revisionService.deleteById(id);
    }
}