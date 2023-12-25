package ru.hh.spring_boot_lesson.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class CustomCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    // Что-то проверяем: можем запрашивать бины из контекста, проверять настройки, ...
    return context.getEnvironment().getProperty("some.property.name") != null;
  }
}
