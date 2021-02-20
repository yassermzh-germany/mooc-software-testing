package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void SingleGInTheBeginning() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("gxxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void SingleGInTheEnd() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxxg");
        Assertions.assertFalse(result);
    }

    @Test
    public void HappyGInTheBegining() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("ggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void HappyGInTheEnd() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxxgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void HappyGInTheMiddle() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("xggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void NoGAtAll() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("xxxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void MultipleHappyG() {
        GHappy g = new GHappy();
        boolean result = g.gHappy("xggxggx");
        Assertions.assertTrue(result);
    }
}
