package com.hospital.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital.web.domain.Info;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
import com.hospital.web.mapper.Mapper;
import com.hospital.web.service.CRUD;

@Controller
@RequestMapping("/patient")
public class PatientController {
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
/*	@Autowired
	Patient patient; 로딩하는순간 연결끝 -mvc가 던져주고 간다. */
	@Autowired Mapper mapper;

	/*@RequestMapping(value="/join",method = RequestMethod.POST)  mvc가 차끌고 다니면서 wiring 하고 있다. 
	public String join(@RequestParam("id") String id, {
		String movePosition="";
		logger.info("PatientController -join() {}","ENTER");  매 method마다 가져다 부친다 
		movePosition="public:patient/registerForm";
		mapper.registerPatient();
		return movePosition;
	}*/


	@RequestMapping("/doctor/{docID}")
	public String getDoctorInfo(@PathVariable String docID) {
		logger.info("PatientController -goLogin() {}",
				"ENTER"); /* goLogin이라는 method안으로 진입하였다 */
		logger.info("PatientController -docID=() {}", docID);
		return "patient:patient/doctorInfo";
	}
}
