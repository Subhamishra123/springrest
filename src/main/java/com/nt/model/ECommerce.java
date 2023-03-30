package com.nt.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ECommerce {
	
	private String name;
	private String address;
	private Integer size;
	private List<Courier> couriers;
	private Set<PaymentGateway> gateways;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime purchaseDate;

}
