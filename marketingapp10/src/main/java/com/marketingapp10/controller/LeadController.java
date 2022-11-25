package com.marketingapp10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp10.dto.LeadData;
import com.marketingapp10.entities.Lead;
import com.marketingapp10.service.LeadService;
import com.marketingapp10.service.LeadServiceImpl;
import com.marketingapp10.utilities.EmailService;

@Controller
public class LeadController {
	@Autowired
	private EmailService emailServ;
	@Autowired
	private LeadService serv;
	@RequestMapping("/create")
public String createView() {
	return "create";
}
	@RequestMapping("/saveLead")
	public String saveoneLead(@ModelAttribute("lead")Lead lead,Model model) {
		emailServ.sendMail(lead.getEmail(), "hi", "hi we have received an enquiry");
		serv.saveLead(lead);
		model.addAttribute("msg","lead is saved!!");
		return "create";
	}
	@RequestMapping("/listall")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads=serv.getLeads();
		model.addAttribute("leads",leads);
		return "listall";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id")long id,Model model) {
		serv.deleteOneLead(id);
		List<Lead> leads=serv.getLeads();
		model.addAttribute("leads",leads);
		return "listall";
	}
	@RequestMapping("/update")
	public String updateOneLead(@RequestParam("id")long id,ModelMap model) {
		Lead lead=serv.findOneLead(id);
		model.addAttribute("lead", lead);
		return "update";
	}	
	@RequestMapping("/updateLead")
	public String update(@ModelAttribute("lead")Lead lead,ModelMap model) {
		serv.saveLead(lead);
		model.addAttribute("msg","lead with id"+lead.getId()+"is updated!");
		List<Lead> leads = serv.getLeads();
		model.addAttribute("leads", leads);
		return "listall";
	}
	
}
