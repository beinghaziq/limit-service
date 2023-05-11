package com.haziq.microservices.limitsservice.controllers;

import com.haziq.microservices.limitsservice.models.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

  @GetMapping("/limits")
  public Limit retrieveAllLimits() {
    return new Limit(1, 2000);
  }
}
