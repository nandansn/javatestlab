package com.nanda.apache.gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

public class GsonTest {
	
	public static void main(String[] args) throws JsonIOException, IOException {
		
		Gson gson = new Gson();
		
		Staff staff = new Staff("Nanda", 10000);
		System.out.println(gson.toJson(staff));
		
		FileWriter writer = new FileWriter("./resources/staff.json");
		
		//gson.toJson(staff, writer);
		
		writer.write(gson.toJson(staff));
		writer.close();
		
		Staff staffJson = gson.fromJson(new FileReader("./resources/staff.json"), Staff.class);
		
		System.out.println(staffJson.toString());
		
	}

}
