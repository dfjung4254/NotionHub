package com.devjk.notionhub.api.controller;

import com.devjk.notionhub.api.model.Sample;
import com.devjk.notionhub.api.repository.SampleRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.json.JSONObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

// 테스트 랜덤포트 생성으로 기존 포트와 충돌 방지
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerTest {

  @LocalServerPort
  private int port;

  @Autowired
  private SampleController sampleController;

  @Autowired
  private SampleRepository sampleRepository;

  @Test
  public void contextLoad() throws Exception {
    Assertions.assertNotNull(sampleController);
  }

  @Test
  public void registerSampleTest() throws Exception {

    Map<String, Object> sampleMap = new HashMap<>(){};
    sampleMap.put("title", "TEST title1");
    sampleMap.put("content", "CONTENT content1");

    String serializedBody = new ObjectMapper().writeValueAsString(sampleMap);

    HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create("http://localhost:" + port + "/sample"))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(serializedBody))
            .build();

    HttpResponse<String> response = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build()
            .send(request, HttpResponse.BodyHandlers.ofString());



    String body = response.body();

    Assertions.assertDoesNotThrow(() -> {
      // 1. check api
      Sample result = new Gson().fromJson(body, Sample.class);
      Assertions.assertNotNull(result);
      Assertions.assertEquals("TEST title1", result.getTitle());
      Assertions.assertEquals("CONTENT content1", result.getContent());
      Assertions.assertNotNull(result.getId());

      // 2. check db
      Sample resultDb = sampleRepository.findById(result.getId()).orElseThrow();
      Assertions.assertNotNull(resultDb);
      Assertions.assertEquals("TEST title1", resultDb.getTitle());
      Assertions.assertEquals("CONTENT content1", resultDb.getContent());
      Assertions.assertNotNull(resultDb.getId());

      // 3. check id
      Assertions.assertEquals(result.getId(), resultDb.getId());
    });

  }

}
