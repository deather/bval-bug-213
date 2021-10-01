package bug.bval;

import bug.bval.endpoints.ChildEndpoint;

import javax.ws.rs.core.Application;
import java.util.Set;

public class MainApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return Set.of(
			ChildEndpoint.class
		);
	}
}
