package com.capstone.medigo.domain.mydata.service.dto;

import java.util.List;

import com.capstone.medigo.domain.mydata.service.dto.main.DetailPrescriptionCase;

public record MyDataDetail(
	List<DetailPrescriptionCase> prescriptions
){
}
