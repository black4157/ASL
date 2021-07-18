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
@RequestMapping("/LSL")
public class LSLController {
	private static final Logger logger = LoggerFactory.getLogger(LSLController.class);
	
	@Inject
	private AslService service;
	
	@Inject
	private AslService2 service2;
	
	@RequestMapping(value = "/LSL_Define", method = RequestMethod.GET)
	public void define(@ModelAttribute("YEAR") YearSearch YS, Model model) throws Exception {
		logger.info("»ýÈ°½ºÆ÷Ã÷Áöµµ»ç ¿ÀÇÂ");
		
		model.addAttribute("listYear", service.listYear());
		model.addAttribute("LSL_AvgScore1", service.LSL_AvgScore1());
		model.addAttribute("LSL_AvgScore2", service.LSL_AvgScore2());
		model.addAttribute("LSL_stare1", service.LSL_stare1(YS));
		model.addAttribute("LSL_stare2", service.LSL_stare2(YS));

		model.addAttribute("LSL_FT1", service2.LSL_FT1());
		model.addAttribute("LSL_FT2", service2.LSL_FT2());
		model.addAttribute("LSL_ftstare1", service2.LSL_ftstare1(YS));
		model.addAttribute("LSL_ftstare2", service2.LSL_ftstare2(YS));
	}
}

