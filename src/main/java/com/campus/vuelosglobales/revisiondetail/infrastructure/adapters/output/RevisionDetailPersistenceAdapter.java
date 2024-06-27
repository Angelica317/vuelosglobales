package com.campus.vuelosglobales.revisiondetail.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.revisiondetail.domain.entities.RevisionDetail;

@Repository
public interface RevisionDetailPersistenceAdapter extends JpaRepository<RevisionDetail, Long> {
}
