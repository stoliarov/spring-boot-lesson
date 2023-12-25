package ru.hh.spring_boot_lesson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.hh.spring_boot_lesson.service.MailService;

@Configuration
public class MailAutoConfiguration {

  @Bean
  public MailService mailService() {
    return new MailService();
  }
}
