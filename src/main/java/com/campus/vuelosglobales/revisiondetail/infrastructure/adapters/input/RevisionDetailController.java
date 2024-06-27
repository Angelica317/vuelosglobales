package com.campus.vuelosglobales.revisiondetail.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.revisiondetail.application.Services.RevisionDetailService;
import com.campus.vuelosglobales.revisiondetail.domain.entities.RevisionDetail;

@RestController
@RequestMapping("/revisiondetails")
public class RevisionDetailController {

    private final RevisionDetailService revisionDetailService;

    public RevisionDetailController(RevisionDetailService revisionDetailService) {
        this.revisionDetailService = revisionDetailService;
    }

    @GetMapping
    public List<RevisionDetail> getAllRevisionDetails() {
        return revisionDetailService.findAll();
    }

    @GetMapping("/{id}")
    public RevisionDetail getRevisionDetailById(@PathVariable Long id) {
        return revisionDetailService.findById(id);
    }

    @PostMapping
    public RevisionDetail createRevisionDetail(@RequestBody RevisionDetail revisionDetail) {
        return revisionDetailService.save(revisionDetail);
    }

    @PutMapping("/{id}")
    public RevisionDetail updateRevisionDetail(@PathVariable Long id, @RequestBody RevisionDetail revisionDetail) {
        revisionDetail.setId(id);
        return revisionDetailService.save(revisionDetail);
    }

    @DeleteMapping("/{id}")
    public void deleteRevisionDetail(@PathVariable Long id) {
        revisionDetailService.deleteById(id);
    }
}
