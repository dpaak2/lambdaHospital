package com.hospital.web.domain;

public enum Enums {
	PATIENT("pat_id"),DOCTOR("doc_id"),NURSE("nur_id"),ADMIN("id"),PAGE_SIZE("5"),BLOCK_SIZE("5"); /*key값이 된다*/
	private String val;
	Enums(String val){
		this.val=val;
	}
	public String val(){
		return val; 
	}


}
