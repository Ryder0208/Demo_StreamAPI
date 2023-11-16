package com.stream.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.stream.repository.PeopleRepository;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@SpringBootApplication
@ComponentScan( {"model","repository"})
public class DemoApplication {

	public static void main(String[] args) throws IOException {
	ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		PeopleRepository repo=context.getBean(PeopleRepository.class);
		System.out.println(repo.getClass().getName());

		Path path=Path.of("src","main","resources","people.csv");
			List<People> peopleList=new ArrayList<>();
		//List<People> peopleList =
			Files.lines(path)
				.skip(1)
				.map(line -> {
					return getPeople(line);
				}).forEach(people -> {
					People people1=new People();
					people1.setFirst_Name(people.getFirst_Name());
					people1.setLast_Name(people.getLast_Name());
					people1.setUser_Id(people.getUser_Id());
					people1.setSex(people.getSex());
					people1.setPhone(people.getPhone());
					people1.setEmail(people.getEmail());
					people.setDate_of_birth(people.getDate_of_birth());
					people1.setJob_Title(people.getJob_Title());
					peopleList.add(people1);
					repo.saveAll(peopleList);
					});

					//collect(Collectors.toList());
		           //System.out.println(peopleList);
	}

	public static People getPeople(String line) {
		String[] fields = line.split(",");
		if (fields.length !=8 )
			throw new RuntimeException("Invalid CSV Format :" + line);
		return new People(fields[0], fields[1], fields[2], fields[3], fields[4], fields[5], fields[6], fields[7]);
	}

}
