package com.devjk.notionhub.sample.controller;

import com.devjk.notionhub.sample.model.Sample;
import com.devjk.notionhub.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class SampleController {

  private SampleService sampleService;

  @Autowired
  public SampleController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @PostMapping("/sample")
  public void registerSample(@RequestBody Sample sample) {

    sampleService.saveSample(sample);

  }

  @GetMapping("/sample/{id}")
  public ResponseEntity<Sample> findSample(@PathVariable Long id) {
    return null;
  }


  @GetMapping("/samples")
  public ResponseEntity<List<Sample>> findAllSamples() {
    return sampleService.findSamples();
  }

}
