package com.Shopping.services;

import java.util.List;

import com.Shopping.entities.Lead;

public interface LeadService {
public void saveLead(Lead lead);

public List<Lead> listLeads();

public void deleteLeadByID(long id);

public Lead getOneLead(long id);
}
