package com.fdmgroup.Traineejson;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * Demonstrates the basic usage of Object Mapper class Trainee class with two
 * data members is to be serialized/deserialized.
 *
 */
public class App {
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();

		// configure mapper

		// this line is used to prevent the JsonGenerator from closing
		// System.out
		mapper.configure(JsonGenerator.Feature.AUTO_CLOSE_TARGET, false);

		// configures Jackson to use newlines and indentation when serializing
		// to improve readability of resulting json file
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		Trainee t1 = new Trainee(1, "Joshua");
		// mapper.writeValue(System.out, t1);

		// uses a static method JacksonUtils to get an outputStream to write our object
		OutputStream os = JacksonUtils.getOuputStream("src/main/resources/demotrainee.json");
		// serializing trainee object
		mapper.writeValue(os, t1);

		// deserializing from string
		String traineeJson = "{\"id\":4,\"name\":\"Jane Doe\"}";

		Trainee traineeFromString = mapper.readValue(traineeJson, Trainee.class);
		System.out.println("\nDeserialized Trainee from String");
		System.out.println(traineeFromString);

		// deserialized from file
		File traineeJsonFile = new File("src/main/resources/demotrainee.json");
		Trainee traineeFromFile = mapper.readValue(traineeJsonFile, Trainee.class);
		System.out.println("\nDeserialized Trainee from File");
		System.out.println(traineeFromFile);

	}
}
