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
@RequestMapping("/DSL")
public class DSLController {
	private static final Logger logger = LoggerFactory.getLogger(DSLController.class);
	
	@Inject
	private AslService service;
	
	@Inject
	private AslService2 service2;
	
	@RequestMapping(value = "/DSL_Define", method = RequestMethod.GET)
	public void define(@ModelAttribute("YEAR") YearSearch YS, Model model) throws Exception {
		logger.info("장애인스포츠지도사 오픈");
		
		model.addAttribute("listYear", service.listYear());
		model.addAttribute("DSL_AvgScore1", service.DSL_AvgScore1());
		model.addAttribute("DSL_AvgScore2", service.DSL_AvgScore2());
		model.addAttribute("DSL_stare1", service.DSL_stare1(YS));
		model.addAttribute("DSL_stare2", service.DSL_stare2(YS));

		model.addAttribute("DSL_FT1", service2.DSL_FT1());
		model.addAttribute("DSL_FT2", service2.DSL_FT2());
		model.addAttribute("DSL_ftstare1", service2.DSL_ftstare1(YS));
		model.addAttribute("DSL_ftstare2", service2.DSL_ftstare2(YS));
	}
}

