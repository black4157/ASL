package com.du.asl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.du.asl.domain.AslVO;
import com.du.asl.domain.YearSearch;
import com.du.asl.persistence.AslDAO;

@Service
public class AslServiceImpl implements AslService {

	@Inject
	private AslDAO dao;

	@Override
	public List<AslVO> listYear() throws Exception {return dao.listYear();}
	
	@Override
	public List<AslVO> LSL_AvgScore1() throws Exception {return dao.LSL_AvgScore1();}
	@Override
	public List<AslVO> LSL_AvgScore2() throws Exception {return dao.LSL_AvgScore2();}
	@Override
	public List<AslVO> LSL_stare1(YearSearch YS) throws Exception {return dao.LSL_stare1(YS);}
	@Override
	public List<AslVO> LSL_stare2(YearSearch YS) throws Exception {return dao.LSL_stare2(YS);}

	
	@Override
	public List<AslVO> DSL_AvgScore1() throws Exception {return dao.DSL_AvgScore1();}
	@Override
	public List<AslVO> DSL_AvgScore2() throws Exception {return dao.DSL_AvgScore2();}
	@Override
	public List<AslVO> DSL_stare1(YearSearch YS) throws Exception {return dao.DSL_stare1(YS);}
	@Override
	public List<AslVO> DSL_stare2(YearSearch YS) throws Exception {return dao.DSL_stare2(YS);}

	
	@Override
	public List<AslVO> PSL_AvgScore1() throws Exception {return dao.PSL_AvgScore1();}
	@Override
	public List<AslVO> PSL_AvgScore2() throws Exception {return dao.PSL_AvgScore2();}
	@Override
	public List<AslVO> PSL_stare1(YearSearch YS) throws Exception {return dao.PSL_stare1(YS);}
	@Override
	public List<AslVO> PSL_stare2(YearSearch YS) throws Exception {return dao.PSL_stare2(YS);}

	
	@Override
	public List<AslVO> HEM_AvgScore1() throws Exception {return dao.HEM_AvgScore1();}
	@Override
	public List<AslVO> HEM_stare1(YearSearch YS) throws Exception {return dao.HEM_stare1(YS);}
	
	
	@Override
	public List<AslVO> SSL_AvgScore1() throws Exception {return dao.SSL_AvgScore1();}
	@Override
	public List<AslVO> SSL_stare1(YearSearch YS) throws Exception {return dao.SSL_stare1(YS);}

	
	@Override
	public List<AslVO> YSL_AvgScore1() throws Exception {return dao.YSL_AvgScore1();}
	@Override
	public List<AslVO> YSL_stare1(YearSearch YS) throws Exception {return dao.YSL_stare1(YS);}
}
