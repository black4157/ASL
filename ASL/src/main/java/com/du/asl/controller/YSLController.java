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
@RequestMapping("/YSL")
public class YSLController {
	private static final Logger logger = LoggerFactory.getLogger(YSLController.class);
	
	@Inject
	private AslService service;
	
	@Inject
	private AslService2 service2;
	
	@RequestMapping(value = "/YSL_Define", method = RequestMethod.GET)
	public void define(@ModelAttribute("YEAR") YearSearch YS, Model model) throws Exception {
		logger.info("유소년스포츠지도사 오픈");
		
		model.addAttribute("listYear", service.listYear());
		model.addAttribute("YSL_AvgScore1", service.YSL_AvgScore1());
		model.addAttribute("YSL_stare1", service.YSL_stare1(YS));
		
		model.addAttribute("listYear2", service2.listYear2());
		model.addAttribute("YSL_FT1", service2.YSL_FT1());
		model.addAttribute("YSL_ftstare1", service2.YSL_ftstare1(YS));
		
	}
}

