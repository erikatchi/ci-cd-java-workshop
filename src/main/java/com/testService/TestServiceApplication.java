package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/** Exemplo básico de um comentário em JavaDoc.
 * com mais de uma linha.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration

public class TestServiceApplication {
     /** Exemplo básico de um comentário em JavaDoc.
     * com mais de uma linha.
     */
	//private String bar = new String("bar");
	public static void main(String[] args) {
		/** Exemplo básico de um comentário em JavaDoc.
		 * com mais de uma linha.
		 */
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
