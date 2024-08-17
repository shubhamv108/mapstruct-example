package org.example;

import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Condition;
import org.mapstruct.Named;

@Setter
public class BaseMapper {

    @Condition
    @Named("isStringNotNullOrEmpty")
    public boolean isStringNotNullOrEmpty(String input) {
        return StringUtils.isNotEmpty( input );
    }

    @Named( "toGender" )
    public String toGender(String gender) {
        return gender.toUpperCase();
    }

}
