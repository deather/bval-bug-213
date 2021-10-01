package bug.bval.endpoints;

import javax.ejb.Stateless;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Stateless
@Produces("*/*")
@Path("/helloWorld")
public class ChildEndpoint extends ParentEndpoint {

	@GET
	public String helloWorld() {
		return super.helloWorld();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void bulkEdit(@Valid EditParam params) {
		// Do some stuff
	}
}
