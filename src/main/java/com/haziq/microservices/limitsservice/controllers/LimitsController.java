package com.haziq.microservices.limitsservice.controllers;

import com.haziq.microservices.limitsservice.configuration.Configuration;
import com.haziq.microservices.limitsservice.models.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
  @Autowired
  private Configuration configuration;
  @GetMapping("/limits")
  public Limit retrieveAllLimits() {
    return new Limit(configuration.getMinimum(), configuration.getMaximum());
  }
}
