package com.du.asl.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.du.asl.domain.AslVO;
import com.du.asl.domain.YearSearch;

@Repository
public class AslDAOImpl implements AslDAO{
	
	@Inject
	private SqlSession session;
	
	private static final String namespace = "com.du.asl.AslMapper";
	
	@Override
	public List<AslVO> listYear() throws Exception{return session.selectList(namespace + ".listYear");}
	
	@Override
	public List<AslVO> LSL_AvgScore1() throws Exception{return session.selectList(namespace + ".LSL_AvgScore1");}
	@Override
	public List<AslVO> LSL_AvgScore2() throws Exception{return session.selectList(namespace + ".LSL_AvgScore2");}
	@Override
	public List<AslVO> LSL_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".LSL_stare1", YS);}
	@Override
	public List<AslVO> LSL_stare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".LSL_stare2", YS);}
	
	
	@Override
	public List<AslVO> DSL_AvgScore1() throws Exception{return session.selectList(namespace + ".DSL_AvgScore1");}
	@Override
	public List<AslVO> DSL_AvgScore2() throws Exception{return session.selectList(namespace + ".DSL_AvgScore2");}
	@Override
	public List<AslVO> DSL_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".DSL_stare1", YS);}
	@Override
	public List<AslVO> DSL_stare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".DSL_stare2", YS);}
	
	
	@Override
	public List<AslVO> PSL_AvgScore1() throws Exception{return session.selectList(namespace + ".PSL_AvgScore1");}
	@Override
	public List<AslVO> PSL_AvgScore2() throws Exception{return session.selectList(namespace + ".PSL_AvgScore2");}
	@Override
	public List<AslVO> PSL_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".PSL_stare1", YS);}
	@Override
	public List<AslVO> PSL_stare2(YearSearch YS) throws Exception{return session.selectList(namespace + ".PSL_stare2", YS);}
	
	
	@Override
	public List<AslVO> HEM_AvgScore1() throws Exception{return session.selectList(namespace + ".HEM_AvgScore1");}
	@Override
	public List<AslVO> HEM_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".HEM_stare1", YS);}
	
	
	@Override
	public List<AslVO> SSL_AvgScore1() throws Exception{return session.selectList(namespace + ".SSL_AvgScore1");}
	@Override
	public List<AslVO> SSL_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".SSL_stare1", YS);}
	
	
	@Override
	public List<AslVO> YSL_AvgScore1() throws Exception{return session.selectList(namespace + ".YSL_AvgScore1");}
	@Override
	public List<AslVO> YSL_stare1(YearSearch YS) throws Exception{return session.selectList(namespace + ".YSL_stare1", YS);}
}
