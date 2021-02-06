package com.piu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.piu.resource.ResourceDetails;

public interface ResouceRepo extends JpaRepository<ResourceDetails, Integer> {

}
