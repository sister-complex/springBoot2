package com.xxxx;

import com.xxxx.mapper.AccountMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisPlusApplicationTests {

	@Autowired
	AccountMapper accountMapper;

	@Test
	void contextLoads() {
		System.out.println(accountMapper.selectById(1));
	}

}
