package com.fimc.hello.model;

import java.io.Serializable;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class MessageRequest implements Serializable {
	private String firstName;
	private String lastName;
	private String birthDate;

}
