package com.devjk.notionhub.api.sample.repository;

import com.devjk.notionhub.api.sample.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
