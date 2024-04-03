package com.example.plugin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.plugin.core.config.EnablePluginRegistries;

@SpringBootApplication
@EnablePluginRegistries(PrintPlugin.class)
public class DemoApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApp1Application.class, args);
	}

}
