package com.ai.aisse.test.mapl;

import java.text.ParseException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ai.aisse.core.po.DemoTable;
import com.ai.aisse.core.po.Sysuser;
import com.ai.aisse.core.rest.IDemoApi;
import com.ai.aisse.core.rest.SysuserApi;
import com.ai.aisse.core.vo.DemoTableVo;
import com.ai.aisse.test.springcontext.SpringContext;

public class RpcTest {
	
public static void main(String[] args) throws ParseException{
	System.out.println("");
	    System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		demoTest();
		
	}

public static void demoTest(){
	System.out.println("");
	System.out.println("========================================");
	ClassPathXmlApplicationContext context = SpringContext.getContext();
	
	/*String [] names=context.getBeanDefinitionNames();
	System.out.print("Beans:");
	for (String string : names) {
		System.out.print(string);
		System.out.println(",");
	}*/
	
	SysuserApi sysuserApi = (SysuserApi) context.getBean("sysuserApiImpl");
	Sysuser po = new Sysuser();
	po = sysuserApi.selectByPrimaryKey(1);
	System.out.println("");
	System.out.println("--------------------------"+po.getDname());
	
}

}
