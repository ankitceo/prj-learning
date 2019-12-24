package com.log4j2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.builder.api.AppenderComponentBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilder;
import org.apache.logging.log4j.core.config.builder.api.ConfigurationBuilderFactory;
import org.apache.logging.log4j.core.config.builder.api.LayoutComponentBuilder;
import org.apache.logging.log4j.core.config.builder.impl.BuiltConfiguration;

public class Log4j2Demo {

	public static void main(String[] args) {
		initLog4j2();

		Logger logger1 = LogManager.getLogger("logger1");
		
		logger1.info("Logger1 Info Message");
		logger1.error("Logger1 Error Message");
	}

	private static void initLog4j2() {
		ConfigurationBuilder<BuiltConfiguration> builder = ConfigurationBuilderFactory.newConfigurationBuilder();
		builder.setStatusLevel(Level.ERROR);

		//Layout Builder
		LayoutComponentBuilder layoutBuilder = builder.newLayout("PatternLayout").addAttribute("pattern",
				"%d{dd-MMM-yyyy hh:mm:ss} %-6level- %msg%n");
		
		//Appender Builder
		AppenderComponentBuilder appenderBuilder1 = builder.newAppender("file1", "File")
				.addAttribute("fileName", "target/LogFile1.log").add(layoutBuilder);
		
		//Add Appender To Configuration Builder
		builder.add(appenderBuilder1);

		//Add Logger To Configuration Builder
		builder.add(builder.newLogger("logger1", Level.INFO).add(builder.newAppenderRef("file1"))
				.addAttribute("additivity", false));
		
		//Initialize Log4j2
		Configurator.initialize(builder.build());
	}

}
