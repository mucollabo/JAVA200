package kr.co.infopub.hrm;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.infopub.hrm.dao.EmployeeDao;
import kr.co.infopub.hrm.dto.DepartmentDto;
import kr.co.infopub.hrm.service.EmployeeService;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class DAOTest2 {  
 @Autowired
 private EmployeeDao service;
 @Test
 public void test() {   
	try {
		List<DepartmentDto> lists=service.findAllDepartments();
		Assert.assertEquals(13, lists.size());
	} catch (Exception e) {
	}
 }
}