package chain;

import com.lyn.demo.design.pattern.chain.abstracts.AbstractCarChain;
import com.lyn.demo.design.pattern.chain.invoke.ChassisChain;
import org.junit.Test;

/**
 * @Description
 */
public class ChainTest {

    @Test
    public void chainTest() {
        AbstractCarChain carChain = new ChassisChain();
        carChain.doChain();
    }
}
