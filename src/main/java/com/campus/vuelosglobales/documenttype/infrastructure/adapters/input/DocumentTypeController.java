package com.campus.vuelosglobales.documenttype.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.documenttype.application.Services.DocumentTypeService;
import com.campus.vuelosglobales.documenttype.domain.entities.DocumentType;

@RestController
@RequestMapping("/document-types")
public class DocumentTypeController {

    private final DocumentTypeService documentTypeService;

    public DocumentTypeController(DocumentTypeService documentTypeService) {
        this.documentTypeService = documentTypeService;
    }

    @GetMapping
    public List<DocumentType> getAllDocumentTypes() {
        return documentTypeService.findAll();
    }

    @GetMapping("/{id}")
    public DocumentType getDocumentTypeById(@PathVariable Long id) {
        return documentTypeService.findById(id);
    }

    @PostMapping
    public DocumentType createDocumentType(@RequestBody DocumentType documentType) {
        return documentTypeService.save(documentType);
    }

    @PutMapping("/{id}")
    public DocumentType updateDocumentType(@PathVariable Long id, @RequestBody DocumentType documentType) {
        documentType.setId(id);
        return documentTypeService.save(documentType);
    }

    @DeleteMapping("/{id}")
    public void deleteDocumentType(@PathVariable Long id) {
        documentTypeService.deleteById(id);
    }
}
