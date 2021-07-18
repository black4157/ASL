package com.du.asl.persistence;

import java.util.List;

import com.du.asl.domain.AslVO2;
import com.du.asl.domain.YearSearch;

public interface AslDAO2 {

	public List<AslVO2> listYear2() throws Exception;

	public List<AslVO2> LSL_FT1() throws Exception;
	public List<AslVO2> LSL_FT2() throws Exception;
	public List<AslVO2> LSL_ftstare1(YearSearch YS) throws Exception;
	public List<AslVO2> LSL_ftstare2(YearSearch YS) throws Exception;

	
	public List<AslVO2> DSL_FT1() throws Exception;
	public List<AslVO2> DSL_FT2() throws Exception;
	public List<AslVO2> DSL_ftstare1(YearSearch YS) throws Exception;
	public List<AslVO2> DSL_ftstare2(YearSearch YS) throws Exception;
	
	
	public List<AslVO2> PSL_FT1() throws Exception;
	public List<AslVO2> PSL_FT2() throws Exception;
	public List<AslVO2> PSL_ftstare1(YearSearch YS) throws Exception;
	public List<AslVO2> PSL_ftstare2(YearSearch YS) throws Exception;
	
	
	public List<AslVO2> HEM_FT1() throws Exception;
	public List<AslVO2> HEM_ftstare1(YearSearch YS) throws Exception;
	
	public List<AslVO2> SSL_FT1() throws Exception;
	public List<AslVO2> SSL_ftstare1(YearSearch YS) throws Exception;
	
	public List<AslVO2> YSL_FT1() throws Exception;
	public List<AslVO2> YSL_ftstare1(YearSearch YS) throws Exception;
	
}
