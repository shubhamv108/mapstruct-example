package org.example;

import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Condition;
import org.mapstruct.Named;

public class BaseMapper {

    @Condition
    @Named("isStringNotNullOrEmpty")
    public boolean isStringNotNullOrEmpty(String input) {
        return StringUtils.isNotEmpty( input );
    }

}
