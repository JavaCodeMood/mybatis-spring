package lt.mybatis.dao;

import java.util.List;

import lt.mybatis.entity.Fun;

/**
 * 内外网工作流处理的代理表
 * 
 * @author wanggang
 */
public interface IMapMDAO
{

	public List<Fun> getHospitalsById(String name);
	 
	 
}
