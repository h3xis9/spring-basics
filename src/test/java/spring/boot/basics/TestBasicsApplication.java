package spring.boot.basics;

import org.springframework.boot.SpringApplication;

public class TestBasicsApplication {

	public static void main(String[] args) {
		SpringApplication.from(BasicsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
