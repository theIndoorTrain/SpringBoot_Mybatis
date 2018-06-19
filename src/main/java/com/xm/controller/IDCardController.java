package com.xm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xm.mapper.IDCardMapper;
import com.xm.pojo.IDCard;

/**
 * 身份证信息的控制类
 * @author xm
 *
 */
@RestController
public class IDCardController {
	@Autowired
	private IDCardMapper iDCardMapper;
	/**
	 * 查出带有学生信息的身份证列表
	 * @return
	 */
	@GetMapping("/IDCardsOfStudent")
	public List<IDCard> listOfStudent(){
		List<IDCard>  iDCards=  iDCardMapper.getListIdOfStudent();
		return iDCards;
	}

}
