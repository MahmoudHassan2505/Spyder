package com.SpringTest.conferencedemo.repositories;

import com.SpringTest.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//we extend it with JpaRepository
//Long is the type of the primaryKey
public interface SessionRepository extends JpaRepository<Session,Long> {


}
