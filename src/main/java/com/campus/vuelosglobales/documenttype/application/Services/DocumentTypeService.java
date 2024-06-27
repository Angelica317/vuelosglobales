package com.campus.vuelosglobales.documenttype.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.documenttype.domain.entities.DocumentType;
import com.campus.vuelosglobales.documenttype.domain.repositories.DocumentTypeRepository;

@Service
public class DocumentTypeService {

    private final DocumentTypeRepository documentTypeRepository;

    public DocumentTypeService(DocumentTypeRepository documentTypeRepository) {
        this.documentTypeRepository = documentTypeRepository;
    }

    public List<DocumentType> findAll() {
        return documentTypeRepository.findAll();
    }

    public DocumentType findById(Long id) {
        return documentTypeRepository.findById(id).orElse(null);
    }

    public DocumentType save(DocumentType documentType) {
        return documentTypeRepository.save(documentType);
    }

    public void deleteById(Long id) {
        documentTypeRepository.deleteById(id);
    }
}
