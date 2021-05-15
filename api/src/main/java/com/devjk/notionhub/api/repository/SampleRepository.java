package com.devjk.notionhub.api.repository;

import com.devjk.notionhub.api.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
