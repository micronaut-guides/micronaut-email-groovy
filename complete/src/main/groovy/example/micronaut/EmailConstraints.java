package example.micronaut;

import groovy.transform.CompileStatic;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = { EmailConstraintsValidator.class })
@Target( { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@CompileStatic
@interface EmailConstraints {

    String message() default "{email.invalid}";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}