package com.quickgames.act.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@AIGenerate(by = AIGenerator.GPT_6, depth = AIDepth.MODERATE, reviewed = AIReviewed.VERIFIED)
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface AIGenerate {

    AIGenerator[] by();

    String[] version() default {};

    AIDepth depth() default AIDepth.COMPLETE;

    AIReviewed reviewed() default AIReviewed.UNKNOWN;

}
