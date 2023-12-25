package ru.hh.spring_boot_lesson.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import ru.hh.spring_boot_lesson.service.MailService;

/*
    Это не какая-то осознанная комбинация аннотаций @Conditional... и @AutoConfigure...
    Все они здесь приведены для примера.
 */
@Configuration
//@ConditionalOnBean(MailService.class)
@ConditionalOnBean(name = "dataSource")
@ConditionalOnMissingBean(MailService.class)
@ConditionalOnClass(DataSource.class)
@ConditionalOnMissingClass("ru.hh.spring_boot_lesson.service.MailService")
@ConditionalOnProperty(
    value = "some.property.example",
    havingValue = "foo"
)
@Conditional(CustomCondition.class)
@AutoConfigureBefore(WebMvcAutoConfiguration.class)
@AutoConfigureAfter(JpaRepositoriesAutoConfiguration.class)
public class ConditionalAutoConfiguration {

}
