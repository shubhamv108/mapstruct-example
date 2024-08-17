package org.example;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper
//@MapperConfig(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL)
public abstract class EmployeeMapper extends BaseMapper {

    @Mappings({
        @Mapping(source="gender", target="gender", conditionQualifiedByName="isStringNotNullOrEmpty", qualifiedByName="toGender"),
        @Mapping(source="contact.emailAddresses.primaryEmailAddress", target="email", defaultValue = "sa")})

    public abstract Target transformSource(Source employee);

}
