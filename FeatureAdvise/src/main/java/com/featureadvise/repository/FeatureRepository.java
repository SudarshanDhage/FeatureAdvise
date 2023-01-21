package com.featureadvise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.featureadvise.domain.Feature;

@Repository
public interface FeatureRepository extends JpaRepository<Feature, Long> {

}
