package com.fimc.hello.resource;


import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Component;

import com.fimc.hello.model.CalculatorResponse;
import com.fimc.hello.model.CalculatorResquest;
import com.fimc.hello.model.CalculatorRun;
import com.fimc.hello.model.MessageResponse;

@Component
@Path("/_calculator")
public class CalculatorResultResource {
	@POST
	   @Produces(MediaType.APPLICATION_JSON)
	   public Response result(CalculatorResquest request) {
		CalculatorResponse calculatorResponse = new CalculatorResponse();
		CalculatorRun calculatorRun = new CalculatorRun();
		MessageResponse messageResponse = new MessageResponse();
		
		
		
		if(calculatorResponse.operator(request.getOperator()).equals("invalid")) {
			messageResponse.setMessage("invalid operator");
			return Response.status(HttpServletResponse.SC_BAD_REQUEST).entity(messageResponse).build();
			
		}else {
			calculatorRun.setAction(calculatorResponse.operator(request.getOperator()));
			calculatorRun.setResult(calculatorResponse.total(request));
			return Response.ok().entity(calculatorRun).build();
		}
		
	}

}
