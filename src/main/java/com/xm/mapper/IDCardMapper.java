package com.xm.mapper;

import java.util.List;

import com.xm.pojo.IDCard;

/**
 * Idcard的数据操作层接口类
 * @author xm
 *
 */
public interface IDCardMapper {
	
	/**
	 * 获取包括学生信息的身份证列表
	 * @return
	 */
	public List<IDCard>  getListIdOfStudent();

}
