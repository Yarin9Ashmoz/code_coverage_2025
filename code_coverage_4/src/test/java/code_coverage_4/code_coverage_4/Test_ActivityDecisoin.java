package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_ActivityDecisoin {
    ActivityDecision tester = new ActivityDecision();

    @Test
    public void testActivityDecision_Walking_Midnight_Raining() {
        String result = tester.decideActivity(true, true, false, false, true);
        String exp = "Take umbrella and searchlight";
        assertEquals(exp, result);
    }

    @Test
    public void testActivityDecision_Walking_Midnight() {
        String result = tester.decideActivity(true, true, false, false, false);
        String exp = "Take searchlight";
        assertEquals(exp, result);
    }

    @Test
    public void testActivityDecision_Running_Sunshine_Raining() {
        String result = tester.decideActivity(false, false, true, true, true);
        String exp = "Take umbrella";
        assertEquals(exp, result);
    }

    @Test
    public void testActivityDecision_All_False() {
        String result = tester.decideActivity(false, false, false, false, false);
        String exp = "Keep doing what you were doing";
        assertEquals(exp, result);
    }

}
