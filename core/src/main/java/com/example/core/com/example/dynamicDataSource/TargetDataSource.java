package com.example.core.com.example.dynamicDataSource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface  TargetDataSource {
    DataSourceKey dataSourceKey() default DataSourceKey.DS_MASTER;
}
