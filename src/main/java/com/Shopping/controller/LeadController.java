package com.Shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Shopping.dto.LeadData;
import com.Shopping.entities.Lead;
import com.Shopping.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	LeadService leadservice;
	
	@RequestMapping("/createLead")
public String viewCreateLeadPage() {
	return"create_lead";
}
	@RequestMapping("/saveLead")
	public String saveonelead(@ModelAttribute("lead") Lead lead ,ModelMap model) {
		leadservice.saveLead(lead);
		model.addAttribute("msg","Lead is saved!!");
		return"create_lead";
	}
	@RequestMapping("/listall")
	public String listallLeads(ModelMap model) {
		List<Lead> leads = leadservice.listLeads();
		model.addAttribute( "leads",leads);
	return"lead_search_result";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")long id , ModelMap model) {
		leadservice.deleteLeadByID(id);
		List<Lead> leads = leadservice.listLeads();
		model.addAttribute( "leads",leads);
	return"lead_search_result";
		
		
	}
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")long id, ModelMap model ) {
		Lead lead = leadservice.getOneLead(id);
		model.addAttribute("lead", lead);
		return"update_lead";
	}
	@RequestMapping("/updateLead")
	public String updateOneLeadData(LeadData data , ModelMap model) {
		Lead lead=new Lead();
		lead.setId(data.getId());
		lead.setFirstName(data.getFirstName());
		lead.setLastName(data.getLastName());
		lead.setEmail(data.getEmail());
	    lead.setMobile(data.getMobile());
	    leadservice.saveLead(lead);
	    List<Lead> leads = leadservice.listLeads();
		model.addAttribute( "leads",leads);
	return"lead_search_result";
	}
	}

