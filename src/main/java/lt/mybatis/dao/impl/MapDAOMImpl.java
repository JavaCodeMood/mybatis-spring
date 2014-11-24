package lt.mybatis.dao.impl;

import java.util.List;

import lt.mybatis.dao.IMapMDAO;
import lt.mybatis.entity.Fun;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

@Transactional()
public class MapDAOMImpl implements IMapMDAO
{
	private Logger logger = LoggerFactory.getLogger("工作流proxy表代理-数据访问Hibernate实现:");

	private SqlSessionTemplate sqlSessionTemplate;
 
	public List<Fun> getHospitalsById(String name) {
		List<Fun> funList= sqlSessionTemplate.selectList("FunMapper.selectFun", name);
		return funList;
	} 
	
	
	
	
	
	
	
	
	public SqlSessionTemplate getSqlSessionTemplate()
	{
		return sqlSessionTemplate;
	} 
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
	{
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
}
