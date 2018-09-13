package com.fimc.hello.model;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
public class CalculatorResquest {
	private double firstNumber;
	private double secondNumber;
	private String operator;
}
