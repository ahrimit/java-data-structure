package dsgnpattn.cmm;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;

public class TestCmm {
	
	@Rule
	public final TestName name = new TestName();
	
	@Before
	public void printMethodName() {
		System.out.println("##############" + name.getMethodName() + "###########");
	}
}
