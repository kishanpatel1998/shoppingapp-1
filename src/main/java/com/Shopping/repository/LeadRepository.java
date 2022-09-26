package com.Shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shopping.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
