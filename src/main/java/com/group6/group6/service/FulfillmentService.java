package com.group6.group6.service;

import com.group6.group6.exception.RequestAlreadyFulfilledException;
import com.group6.group6.model.Fulfillment;
import com.group6.group6.model.Request;
import com.group6.group6.model.User;
import com.group6.group6.repository.FulfillmentRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class FulfillmentService {

  @Autowired
  private FulfillmentRepository fulfillmentRepository;

  public void fulfilRequest(Request request, User user) throws RequestAlreadyFulfilledException {
    if (request.isFulfilled()) {
      throw new RequestAlreadyFulfilledException();
    } else {
      Fulfillment fulfillment = new Fulfillment(request, user);
      fulfillmentRepository.saveAndFlush(fulfillment);
    }
  }

}