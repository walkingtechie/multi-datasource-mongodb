package com.walking.techie.controller;

import com.walking.techie.handler.SaveTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("save")
public class Transaction {

  @Autowired
  private SaveTransaction saveTransaction;

  @PostMapping
  public String save() {
    saveTransaction.save();
    return "success";
  }
}
