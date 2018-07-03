package com.github.nexus.config.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({FIELD, PARAMETER, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = SslConfigValidator.class)
@Documented
public @interface ValidSsl {

    String message() default "{com.github.nexus.config.constraints.ValidSsl.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    boolean checkSslValid() default true;
}