package starbucks.service.resteasyjackson;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import starbucks.domain.Order;


@Path("/order")
public class StarbucksService {


	@PUT
	@Path("/put/{orderNumber}")
	@Consumes("application/json")
	public Response changeOrder(@PathParam("orderNumber") String orderNumber, 
			@HeaderParam("Expect") String expectations,
			Order order) {
 
		System.out.println("Server retrieves orderNr: " + orderNumber);
		System.out.println("Server retrieves orderNr: " + orderNumber);
		
		String result = "Order nr: " + orderNumber + " will be updated with additions: " + order.getAdditions();
		result += " and expects: " + expectations; 
		
		return Response.status(200).entity(result).build();
 
	}

	
	@OPTIONS
	@Path("/options/{orderNumber}")
	public Response checkOptionsForOrder(@PathParam("orderNumber") String orderNumber) {
 
		System.out.println("Server retrieves orderNr: " + orderNumber);
		String result = "Allow: GET, PUT";
		return Response.status(200).entity(result).build();
 
	}
	
	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createOrder(Order order) {
 
		String result = "Order created : " + order;
		return Response.status(201).entity(result).build();
 
	}
	
}
