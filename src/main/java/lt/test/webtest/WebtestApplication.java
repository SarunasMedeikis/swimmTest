package lt.test.webtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtestApplication.class, args);
	}

	public void testa(){
		Shape shape = new Shape("shape", "red");
		shape.getArea();
		Square square = new Square("square", "blue", 5);
		square.getArea();
		Shape shape1 = new Shape();
		shape1.setName("shape1");
	}

}
