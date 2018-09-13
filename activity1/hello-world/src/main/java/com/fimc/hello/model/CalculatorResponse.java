package com.fimc.hello.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Setter
@Getter
public class CalculatorResponse {

	
	public double total(CalculatorResquest request) {

		 
		 double total=0;
		 if(request.getOperator().equals("+")) {
			 total = request.getFirstNumber() + request.getSecondNumber();
			 
		 }else if(request.getOperator().equals("-")) {
			 total = request.getFirstNumber() - request.getSecondNumber();
			 
		 }else if (request.getOperator().equals("*")) {
			 total=request.getFirstNumber() * request.getSecondNumber();
			 
		 }else if(request.getOperator().equals("/")) {
			 total = request.getFirstNumber() / request.getSecondNumber();
		 }
		 
		return total;
		
	}
	
	public String operator(String operator) {
		String result = "";
		switch (operator) {
		case "+":
			result="ADDITION";
			break;
		case "-":
			result="SUBTRACTION";
			break;
		case "*":
			result="MULTIPLICATION";
			break;
		case "/":
			result="DEVITION";
			break;

		default:
			result="invalid operator";
			break;
		}
		return result;
		
	}
}
