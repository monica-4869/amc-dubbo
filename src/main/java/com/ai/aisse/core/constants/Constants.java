package com.ai.aisse.core.constants;

/**
 * 常用静态参数
 * @author archer
 *
 */
public class Constants {

	/**
	 * 通用静态参数
	 * @author mapl
	 *
	 */
	public static class Common {
		
		public static final String SECURITY_KEY = "7331c9b6b1a1d521363f7bca8acb095f";// md5加密密钥

		
	}	
	
	/**
	 * 以表为单位区分
	 * 表名demo_table
	 * @author mapl
	 *
	 */
	public static class DemoTable {
		
		//字段名 有效标识
        public static class ValidFlag {
            // 有效
            public static final String YES = "1";

            // 无效
            public static final String NO = "2";
            
            
             //*********hyh**********************************  以下要配到库里
            // 费用分类  手机话费报销
            public static final String EXPENSE_CATEGORY_ID = "82a949e4-ef94-4284-9a73-65e62196cef7";
            //申请单类型  手机话费报销
            public static final String VOUCHER_TYPE_ID = "8B404821-071B-49a7-B217-3DF00F3E79E8";
            
            //最多能报销包含当前月的前几个月,(默认是12)   web的Constants.class
            public static final int BEFOR_MAX_MONTHNUM = 12;// 最多能报销包含当前月的前几个月,(默认是12)
        }
	}
	
	public static class EmployeeInfo{
		public static class currentFlag{
			//Y
			public static final String Yes="Y";
			 
		}
	}
	public static class traffic{
		public static final int noCommit=0;//未提交
		public static final int isCommit=1;//已提交
		
	}
	
	public static class item{
		public static final int noCommit=0;//未提交
		public static final int isCommit=1;//已提交
		
	}
	public static class ProjectInfo{
		public static String interfaceCode="XXAI_PROJECT_ALL_V1";
		public static String accessPwd="djk*3k@-3_31";
	}
	 
	 
	
}