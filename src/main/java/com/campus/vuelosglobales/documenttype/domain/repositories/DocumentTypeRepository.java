package com.campus.vuelosglobales.documenttype.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.documenttype.domain.entities.DocumentType;

public interface DocumentTypeRepository {
    List<DocumentType> findAll();
    Optional<DocumentType> findById(Long id);
    DocumentType save(DocumentType documentType);
    void deleteById(Long id);
}
