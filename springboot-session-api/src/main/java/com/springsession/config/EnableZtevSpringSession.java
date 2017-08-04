package com.springsession.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by ${xiaozb} on 2017/6/21.
 *
 * @copyright by ztev
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(SessionConfig.class)
@Documented
public @interface EnableZtevSpringSession {

}
