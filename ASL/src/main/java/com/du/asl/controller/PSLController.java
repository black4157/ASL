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
@RequestMapping("/PSL")
public class PSLController {
	private static final Logger logger = LoggerFactory.getLogger(PSLController.class);
	
	@Inject
	private AslService service;
	
	@Inject
	private AslService2 service2;
	
	@RequestMapping(value = "/PSL_Define", method = RequestMethod.GET)
	public void define(@ModelAttribute("YEAR") YearSearch YS, Model model) throws Exception {
		logger.info("Àü¹®½ºÆ÷Ã÷Áöµµ»ç ¿ÀÇÂ");
		
		model.addAttribute("listYear", service.listYear());
		model.addAttribute("PSL_AvgScore1", service.PSL_AvgScore1());
		model.addAttribute("PSL_AvgScore2", service.PSL_AvgScore2());
		model.addAttribute("PSL_stare1", service.PSL_stare1(YS));
		model.addAttribute("PSL_stare2", service.PSL_stare2(YS));

		model.addAttribute("PSL_FT1", service2.PSL_FT1());
		model.addAttribute("PSL_FT2", service2.PSL_FT2());
		model.addAttribute("PSL_ftstare1", service2.PSL_ftstare1(YS));
		model.addAttribute("PSL_ftstare2", service2.PSL_ftstare2(YS));
	}
}

