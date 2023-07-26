package com.springboot30.security.encrypteDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.AttributeConverter;

@Configuration
public class DB implements AttributeConverter<Object, String> {

	@Autowired
	EncryptionUtil encryptionUtil;

	@Override
	public String convertToDatabaseColumn(Object attribute) {
		return encryptionUtil.encrypt((String) attribute);
	}

	@Override
	public Object convertToEntityAttribute(String dbData) {

		return encryptionUtil.decrypt(dbData);

	}

}
