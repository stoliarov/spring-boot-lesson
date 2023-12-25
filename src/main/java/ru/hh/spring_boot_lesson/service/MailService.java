package ru.hh.spring_boot_lesson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MailService {

  @Autowired
  public MailService() {
    System.out.println("Mail service bean created 1");
  }
}
