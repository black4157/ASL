package com.du.asl.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.du.asl.domain.AslVO2;
import com.du.asl.domain.YearSearch;
import com.du.asl.persistence.AslDAO2;

@Service
public class AslServiceImpl2 implements AslService2 {

	@Inject
	private AslDAO2 dao2;

	@Override
	public List<AslVO2> listYear2() throws Exception {return dao2.listYear2();}
	
	@Override
	public List<AslVO2> LSL_FT1() throws Exception {return dao2.LSL_FT1();}
	@Override
	public List<AslVO2> LSL_FT2() throws Exception {return dao2.LSL_FT2();}
	@Override
	public List<AslVO2> LSL_ftstare1(YearSearch YS) throws Exception {return dao2.LSL_ftstare1(YS);}
	@Override
	public List<AslVO2> LSL_ftstare2(YearSearch YS) throws Exception {return dao2.LSL_ftstare2(YS);}

	
	@Override
	public List<AslVO2> DSL_FT1() throws Exception {return dao2.DSL_FT1();}
	@Override
	public List<AslVO2> DSL_FT2() throws Exception {return dao2.DSL_FT2();}
	@Override
	public List<AslVO2> DSL_ftstare1(YearSearch YS) throws Exception {return dao2.DSL_ftstare1(YS);}
	@Override
	public List<AslVO2> DSL_ftstare2(YearSearch YS) throws Exception {return dao2.DSL_ftstare2(YS);}

	
	@Override
	public List<AslVO2> PSL_FT1() throws Exception {return dao2.PSL_FT1();}
	@Override
	public List<AslVO2> PSL_FT2() throws Exception {return dao2.PSL_FT2();}
	@Override
	public List<AslVO2> PSL_ftstare1(YearSearch YS) throws Exception {return dao2.PSL_ftstare1(YS);}
	@Override
	public List<AslVO2> PSL_ftstare2(YearSearch YS) throws Exception {return dao2.PSL_ftstare2(YS);}

	
	@Override
	public List<AslVO2> HEM_FT1() throws Exception {return dao2.HEM_FT1();}
	@Override
	public List<AslVO2> HEM_ftstare1(YearSearch YS) throws Exception {return dao2.HEM_ftstare1(YS);}
	
	
	@Override
	public List<AslVO2> SSL_FT1() throws Exception {return dao2.SSL_FT1();}
	@Override
	public List<AslVO2> SSL_ftstare1(YearSearch YS) throws Exception {return dao2.SSL_ftstare1(YS);}

	
	@Override
	public List<AslVO2> YSL_FT1() throws Exception {return dao2.YSL_FT1();}
	@Override
	public List<AslVO2> YSL_ftstare1(YearSearch YS) throws Exception {return dao2.YSL_ftstare1(YS);}
}
