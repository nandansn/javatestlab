package com.java;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(value = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
public class EntityParam {
    
    String entityName;
    SchemaParam schemaParam;
}