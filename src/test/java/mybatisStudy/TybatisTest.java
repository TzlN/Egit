package mybatisStudy;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.tzl.entity.User;


public class TybatisTest {

	private SqlSession session ;
	
	@Before
	public void setUp() throws Exception {
		String resource = "config/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();
		System.out.println(session);
	}

	@Test
	public void test() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", 1);
//		map.put("name", "四");
		map.put("birthday", stringToDate("16-07-25"));
//		User user = session.selectOne("dynamicSelect",map);
		List<User> users = session.selectList("dynamicSelect",map);
		System.out.println(users.size());
	}
	@Test
	public void testOne2One() throws Exception {
		//一对一
//		User user = session.selectOne("com.tzl.user.mapper.UserMapper.selectUserAndCity",1);
//		System.out.println(user);
		//一对多
//		List<User> users = session.selectList("com.tzl.user.mapper.UserMapper.selectUserInfo",1);
//		System.out.println(users);
		List<User> users = session.selectList("com.tzl.user.mapper.UserMapper.selectUserOrder",1);
		System.out.println(users);
	}
	/**
	 * 分页测试
	 * @throws Exception 
	 */
	@Test
	public void pageTest() throws Exception{
		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("id", 1);
//		map.put("name", "四");
		map.put("birthday", stringToDate("12-07-25"));
		
//		Integer total = session.selectOne("selectTotal", map);
		int page = 1;
		int pageSize = 3;
		
//		int totalPage = total%pageSize == 0 ? total/pageSize : total/pageSize +1;
		int start = (page-1)*pageSize;
		map.put("start", start);
		map.put("pageSize", pageSize);
		
		List<User> users = session.selectList("dynamicSelect", map);
		System.out.println(users);
		
	}
	
	@Test
	public void insert() throws Exception{
		
		for(int i=0;i<10;i++){
			User user = new User();
			user.setName("李四"+i);
			user.setAge(20);
			user.setAddress("湖北"+i);
			user.setBirthday(stringToDate("16-05-23"));
			session.insert("insert",user);
			session.commit();
		}
		session.close();
//		System.out.println(user);
	}

	
	private static Date stringToDate(String date) throws Exception{
		String format = "yy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(date);
	}
}
