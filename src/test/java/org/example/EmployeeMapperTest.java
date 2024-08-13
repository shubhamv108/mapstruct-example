package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class EmployeeMapperTest {

    @Test
    void shouldNotThrowANullPointer() {
        Source source = new Source();

        Target target = Mappers.getMapper( EmployeeMapper.class ).transformSource( source );
        Assertions.assertNull( source.getGender() );
    }
}
