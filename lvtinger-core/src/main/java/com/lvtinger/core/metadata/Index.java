package com.lvtinger.core.metadata;

public @interface Index {
    int type() default 0;
    String name() default "";
}