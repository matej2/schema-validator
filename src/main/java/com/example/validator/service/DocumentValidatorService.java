package com.example.validator.service;

import com.weedow.schemaorg.serializer.JsonLdException;
import com.weedow.schemaorg.serializer.deserialization.JsonLdDeserializer;
import com.weedow.schemaorg.serializer.deserialization.JsonLdDeserializerImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocumentValidatorService {
    @GetMapping
    public Object validateInput(@RequestBody String requestBody) throws JsonLdException {
        JsonLdDeserializer jsonLdDeserializer = new JsonLdDeserializerImpl();
        return jsonLdDeserializer.deserialize(requestBody);
    }
}
