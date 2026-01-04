package code_coverage_4.code_coverage_4;

public class ActivityDecision {

    public String decideActivity(boolean Walking, boolean Midnight, boolean Running, boolean Sunshine, boolean Raining) {
        if (Walking && Midnight) {
            if (Raining) {
                return "Take umbrella and searchlight";
            } else {
                return "Take searchlight";
            }
        } else if (Running && Sunshine) {
            if (Raining) {
                return "Take umbrella";
            }
        }
        return "Keep doing what you were doing";
    }


}//end class
