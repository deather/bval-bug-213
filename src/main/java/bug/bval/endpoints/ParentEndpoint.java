package bug.bval.endpoints;

import javax.validation.Valid;

@SuppressWarnings("unused")
public abstract class ParentEndpoint {
	public String helloWorld() {
		return "Hello world !!";
	}

	public abstract void bulkEdit(@Valid EditParam param);
}
