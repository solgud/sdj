package statepattern;

public interface CarConstants
{
	CarState FORWARD = new CarForward();
	CarState BACKWARD = new CarBackward();
	CarState HEADLIGHTS_AFTER_FORWARD = new CarHeadlightsAfterForward();
	CarState HEADLIGHTS_AFTER_BACKWARD = new CarHeadlightsAfterBackward();
	CarState OFF_INITIAL = new CarOffInitial();
	CarState OFF_AFTER_HEADLIGHTS = new CarOffAfterHeadlights();
	CarState OFF_AFTER_FORWARD = new CarOffAfterForward();
	CarState OFF_AFTER_BACKWARD = new CarOffAfterBackward();

}
