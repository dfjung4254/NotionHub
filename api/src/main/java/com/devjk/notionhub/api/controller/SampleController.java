package com.devjk.notionhub.api.controller;

import com.devjk.notionhub.api.annotation.NotionHubRestController;
import com.devjk.notionhub.api.model.Sample;
import com.devjk.notionhub.api.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@NotionHubRestController
public class SampleController {

  private SampleService sampleService;

  @Autowired
  public SampleController(SampleService sampleService) {
    this.sampleService = sampleService;
  }

  @PostMapping("/sample")
  public ResponseEntity<Sample> registerSample(@RequestBody Sample sample) {
    return sampleService.saveSample(sample);
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
