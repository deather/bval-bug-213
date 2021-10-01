package bug.bval.endpoints;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("unused")
public class EditParam{
	@NotNull
	private Long id;

	@NotNull
	@Size(min = 1)
	private String test;

	public Long getId() {
		return id;
	}

	public String getTest() {
		return test;
	}
}
