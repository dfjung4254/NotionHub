package com.devjk.notionhub.sample.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Sample {

  public Sample() {
    this("무제", "");
  }

  public Sample(String title) {
    this(title, "");
  }

  public Sample(String title, String content) {
    this.title = title;
    this.content = content;
  }

  @Id
  @GeneratedValue
  private Long id;

  private String title;
  private String content;

}
