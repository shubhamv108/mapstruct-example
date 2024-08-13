package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.Named;

@Mapper
public abstract class EmployeeMapper extends BaseMapper {

    @Mappings({
        @Mapping(source="gender", target="gender", conditionQualifiedByName="isStringNotNullOrEmpty", qualifiedByName="toGender")})
    public abstract Target transformSource(Source employee);

    @Named( "toGender" )
    public String toGender(String gender) {
        return gender.toUpperCase();
    }

}
