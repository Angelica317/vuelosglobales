package com.campus.vuelosglobales.documenttype.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.documenttype.domain.entities.DocumentType;
import com.campus.vuelosglobales.documenttype.domain.repositories.DocumentTypeRepository;

@Component
public class DocumentTypeRepositoryImpl implements DocumentTypeRepository {

    private final DocumentTypePersistenceAdapter documentTypePersistenceAdapter;

    public DocumentTypeRepositoryImpl(DocumentTypePersistenceAdapter documentTypePersistenceAdapter) {
        this.documentTypePersistenceAdapter = documentTypePersistenceAdapter;
    }

    @Override
    public List<DocumentType> findAll() {
        return documentTypePersistenceAdapter.findAll();
    }

    @Override
    public Optional<DocumentType> findById(Long id) {
        return documentTypePersistenceAdapter.findById(id);
    }

    @Override
    public DocumentType save(DocumentType documentType) {
        return documentTypePersistenceAdapter.save(documentType);
    }

    @Override
    public void deleteById(Long id) {
        documentTypePersistenceAdapter.deleteById(id);
    }
}
