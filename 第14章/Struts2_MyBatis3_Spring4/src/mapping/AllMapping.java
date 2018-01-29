package mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllMapping {
	@Autowired
	private IUserinfoMapping userinfoMapping;

	public IUserinfoMapping getUserinfoMapping() {
		return userinfoMapping;
	}

	public void setUserinfoMapping(IUserinfoMapping userinfoMapping) {
		this.userinfoMapping = userinfoMapping;
	}

}
