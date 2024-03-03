package com.placementportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.placementportal.Entity.CreateJob;

@Repository
public interface CreateJobRepo extends JpaRepository<CreateJob, Integer>{

}
