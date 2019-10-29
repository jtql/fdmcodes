package com.fdmgroup.Traineejson;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JacksonUtils {
	public static OutputStream getOuputStream(String path) throws IOException {
		Path outputPath = Paths.get(path);
		if (!outputPath.toFile().exists()) {
			Files.createFile(outputPath);
		}
		return Files.newOutputStream(outputPath);
	}
}
