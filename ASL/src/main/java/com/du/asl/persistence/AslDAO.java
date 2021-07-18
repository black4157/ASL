package com.du.asl.persistence;

import java.util.List;

import com.du.asl.domain.AslVO;
import com.du.asl.domain.YearSearch;

public interface AslDAO {

	public List<AslVO> listYear() throws Exception;

	public List<AslVO> LSL_AvgScore1() throws Exception;
	public List<AslVO> LSL_AvgScore2() throws Exception;
	public List<AslVO> LSL_stare1(YearSearch YS) throws Exception;
	public List<AslVO> LSL_stare2(YearSearch YS) throws Exception;

	
	public List<AslVO> DSL_AvgScore1() throws Exception;
	public List<AslVO> DSL_AvgScore2() throws Exception;
	public List<AslVO> DSL_stare1(YearSearch YS) throws Exception;
	public List<AslVO> DSL_stare2(YearSearch YS) throws Exception;
	
	
	public List<AslVO> PSL_AvgScore1() throws Exception;
	public List<AslVO> PSL_AvgScore2() throws Exception;
	public List<AslVO> PSL_stare1(YearSearch YS) throws Exception;
	public List<AslVO> PSL_stare2(YearSearch YS) throws Exception;
	
	
	public List<AslVO> HEM_AvgScore1() throws Exception;
	public List<AslVO> HEM_stare1(YearSearch YS) throws Exception;
	
	public List<AslVO> SSL_AvgScore1() throws Exception;
	public List<AslVO> SSL_stare1(YearSearch YS) throws Exception;
	
	public List<AslVO> YSL_AvgScore1() throws Exception;
	public List<AslVO> YSL_stare1(YearSearch YS) throws Exception;
	
}
