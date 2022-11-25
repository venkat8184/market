package com.marketingapp10.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketingapp10.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
