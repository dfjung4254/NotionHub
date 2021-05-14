package com.devjk.notionhub.sample.repository;

import com.devjk.notionhub.sample.model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
