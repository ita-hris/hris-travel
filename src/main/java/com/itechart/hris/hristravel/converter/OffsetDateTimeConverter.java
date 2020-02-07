package com.itechart.hris.hristravel.converter;

import java.time.OffsetDateTime;
import org.dozer.CustomConverter;

/**
 * OffsetDateTimeConverter is used by Dozer
 * for performing custom converting of {@link java.time.OffsetDateTime}
 */
public class OffsetDateTimeConverter implements CustomConverter {

    @Override
    public Object convert(Object dest, Object source, Class<?> destType, Class<?> sourceType) {
        if (source == null) {
            return null;
        }

        if (source instanceof OffsetDateTime) {
            // Since OffsetDateTime is immutable, it is safe to return direct link to source object
            return source;
        } else {
            return null;
        }
    }
}
