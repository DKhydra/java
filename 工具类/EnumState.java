package org.util;

/**
 * 枚举状态类别
 * @author arron
 *
 */
public class EnumState {
	
	/**
	 * 表示肯定意思，存在，使用
	 */
	public static Integer USE = 1;
	
	/**
	 * 表示否定意思，不存在，不使用
	 */
	public static Integer NO_USE = 0;
	
	//部门
    public enum InventoryOutDepType {

        // 利用构造函数传参
        A("服务部",1), B("会籍部",2), C("健康管理中心",3), D("精准运动中心",4) ,E("优美生命中心",5) ,F("餐饮部",6);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private InventoryOutDepType(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    //物料采购申请状态
    public enum PurchaseState {

        // 利用构造函数传参
        A("申请中",0), B("已通过",1), C("已拒绝",2);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private PurchaseState(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    //美容预约状态
    public enum BeautyAppointmentState {

        // 利用构造函数传参
        A("预约待确认",0), B("预约成功",1), C("预约完成",2), D("预约取消",3);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private BeautyAppointmentState(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    //健身预约状态
    public enum SportAppointmentState {

        // 利用构造函数传参
        A("预约待确认",0), B("预约成功",1), C("预约完成",2), D("预约取消",3);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private SportAppointmentState(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    //预约类型
    public enum AppointmentType {

        // 利用构造函数传参
        A("美容预约",1), B("健身预约",2);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private AppointmentType(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
    
    //健身产品类型
    public enum SportProductType {

        // 利用构造函数传参
        A("私课",1), B("团课",2);

        // 定义私有变量
        private int nCode;
        private String name;

        // 构造函数，枚举类型只能为私有
        private SportProductType(String name , int _nCode) {
        	this.name = name;
            this.nCode = _nCode;
        }

        public Integer getState() {
            return this.nCode;
        }
        
        public String getName() {
            return this.name;
        }
    }
}
