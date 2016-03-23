package ru.klepekov.game.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import ru.klepekov.game.GameConstants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by alexey on 20.03.16.
 */
public class CustomJsonMapper extends ObjectMapper {

    public CustomJsonMapper() {
        DateFormat df = new SimpleDateFormat(GameConstants.JSON_FORMAT_PATTERN, GameConstants.DEFAULT_LOCALE);
        df.setLenient(false);
        super.setDateFormat(df);
        super.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        super.disable(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS);
        super.disable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
        super.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        super.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        super.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
        super.enable(SerializationFeature.INDENT_OUTPUT);

    }
}
