package com.du.asl.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.du.asl.domain.AslVO2;
import com.du.asl.domain.YearSearch;

@Repository
public class AslDAOImpl2 implements AslDAO2{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "com.du.asl.AslMapper2";
	
	@Override
	public List<AslVO2> listYear2() throws Exception{return session.selectList(namespace + ".listYear2");}
	
	@Override
	public List<AslVO2> LSL_FT1() throws Exception{return session.selectList(namespace + ".LSL_FT1");}
	@Override
	public List<AslVO2> LSL_FT2() throws Exception{return session.selectList(namespace + ".LSL_FT2");}
	@Override
	public List<AslVO2> LSL_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".LSL_ftstare1", YS);}
	@Override
	public List<AslVO2> LSL_ftstare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".LSL_ftstare2", YS);}
	
	
	@Override
	public List<AslVO2> DSL_FT1() throws Exception{return session.selectList(namespace + ".DSL_FT1");}
	@Override
	public List<AslVO2> DSL_FT2() throws Exception{return session.selectList(namespace + ".DSL_FT2");}
	@Override
	public List<AslVO2> DSL_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".DSL_ftstare1", YS);}
	@Override
	public List<AslVO2> DSL_ftstare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".DSL_ftstare2", YS);}
	
	
	@Override
	public List<AslVO2> PSL_FT1() throws Exception{return session.selectList(namespace + ".PSL_FT1");}
	@Override
	public List<AslVO2> PSL_FT2() throws Exception{return session.selectList(namespace + ".PSL_FT2");}
	@Override
	public List<AslVO2> PSL_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".PSL_ftstare1", YS);}
	@Override
	public List<AslVO2> PSL_ftstare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".PSL_ftstare2", YS);}
	
	
	@Override
	public List<AslVO2> HEM_FT1() throws Exception{return session.selectList(namespace + ".HEM_FT1");}
	@Override
	public List<AslVO2> HEM_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".HEM_stare", YS);}
	
	
	@Override
	public List<AslVO2> SSL_FT1() throws Exception{return session.selectList(namespace + ".SSL_FT1");}
	@Override
	public List<AslVO2> SSL_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".SSL_stare", YS);}
	
	
	@Override
	public List<AslVO2> YSL_FT1() throws Exception{return session.selectList(namespace + ".YSL_FT1");}
	@Override
	public List<AslVO2> YSL_ftstare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".YSL_stare", YS);}
}
