package com.hospital.web.mapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hospital.web.domain.Doctor;
import com.hospital.web.domain.Info;
import com.hospital.web.domain.Nurse;
import com.hospital.web.domain.Patient;
import com.hospital.web.domain.Person;
@Repository
public interface Mapper { 
	public int registerPatient(Object o) throws Exception;
	public int registerDoctor(Object o) throws Exception;
	public int registerNurse(Object o) throws Exception;
	public Patient findPatient(Map<?, ?>map) throws Exception;
	public Doctor findDoctor(Map<?, ?>map) throws Exception;
	public Nurse findNurse(Map<?, ?>map) throws Exception;
	public List<Patient> findPatients(Map<?,?>map)throws Exception;
	public List<Doctor> findDoctors(Map<?,?>map)throws Exception;
	public List<Nurse> findNurses(Map<?,?>map)throws Exception;
	public int updatePatient(Patient member) throws Exception;
	public int updateDoctor(Doctor member) throws Exception;
	public int updateNurse(Nurse member) throws Exception;
	public int delete(Patient member) throws Exception;
	public int count()throws Exception;
	public int exist(Map<?,?>map)throws Exception;
}
