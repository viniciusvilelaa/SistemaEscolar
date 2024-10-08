package br.imd.SistemaEscolar;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SistemaEscolarApplication {


	@Value("${application.name}")
	public String appName;

	@GetMapping("/hello")
	public String olaMundo(){
		return appName;
	}



	public static void main(String[] args) {
		SpringApplication.run(SistemaEscolarApplication.class, args);
	}

}
