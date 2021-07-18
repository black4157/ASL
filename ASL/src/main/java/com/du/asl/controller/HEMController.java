package com.du.asl.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.du.asl.domain.YearSearch;
import com.du.asl.service.AslService;
import com.du.asl.service.AslService2;

@Controller
@RequestMapping("/HEM")
public class HEMController {
	private static final Logger logger = LoggerFactory.getLogger(HEMController.class);
	
	@Inject
	private AslService service;
	
	@Inject
	private AslService2 service2;
	
	@RequestMapping(value = "/HEM_Define", method = RequestMethod.GET)
	public void define(@ModelAttribute("YEAR") YearSearch YS, Model model) throws Exception {
		logger.info("건강운동관리사 오픈");
		
		model.addAttribute("listYear", service.listYear());
		model.addAttribute("HEM_AvgScore1", service.HEM_AvgScore1());
		model.addAttribute("HEM_stare1", service.HEM_stare1(YS));
		
		model.addAttribute("listYear2", service2.listYear2());
		model.addAttribute("HEM_FT1", service2.HEM_FT1());
		model.addAttribute("HEM_ftstare1", service2.HEM_ftstare1(YS));
	}

}

