package com.campus.vuelosglobales.documenttype.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.documenttype.domain.entities.DocumentType;

@Repository
public interface DocumentTypePersistenceAdapter extends JpaRepository<DocumentType, Long> {
}
