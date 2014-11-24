package njrf.map.test;

import java.io.IOException;
import java.util.List;

import lt.mybatis.dao.IMapMDAO;
import lt.mybatis.entity.Fun;
import lt.util.ConsoleUtil;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:test.map.cfg.xml" })
public class HospitalHServiceTest
{
	@Autowired
	IMapMDAO mapMDAO;

	@Test
	public void testGetHospitalsById() throws Exception
	{
		List<Fun> funList = mapMDAO.getHospitalsById("北湖公园");
		ConsoleUtil.ConsoleObject(funList);
	}

	// @Test
	public void TestGetHospital() throws JsonGenerationException, JsonMappingException, IOException
	{
		// ConsoleUtil.ConsoleObject(hospitalService.getHospitals());
		// ConsoleUtil.ConsoleObject(mapService.getRoads());
		// ConsoleUtil.ConsoleObject(mapService.getHospitals());
		// ConsoleUtil.ConsoleObject(mapService.getBufferFun());

	}

}
