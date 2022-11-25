package com.marketingapp10.service;

import java.util.List;

import com.marketingapp10.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public List<Lead> getLeads();

public void deleteOneLead(long id);


public Lead findOneLead(Long id);

}
