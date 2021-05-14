package com.devjk.notionhub.sample.service;

import com.devjk.notionhub.sample.model.Sample;
import com.devjk.notionhub.sample.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {

  private SampleRepository sampleRepository;

  @Autowired
  public SampleService(SampleRepository sampleRepository) {
    this.sampleRepository = sampleRepository;
  }

  public void saveSample(Sample sample) {
    sampleRepository.save(sample);
  }

  public ResponseEntity<Sample> getSampleById(Long id) {
    return ResponseEntity.of(sampleRepository.findById(id));
  }

  public ResponseEntity<List<Sample>> findSamples() {
    return ResponseEntity.of(Optional.of(sampleRepository.findAll()));
  }

}
