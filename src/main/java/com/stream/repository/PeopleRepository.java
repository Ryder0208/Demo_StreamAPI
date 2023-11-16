package com.stream.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stream.model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, String> {

}
