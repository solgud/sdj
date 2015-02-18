package statepattern;

public interface CarConstants {
	CarState FORWARD = new CarForward();
	CarState BACKWARD = new CarBackward();
	CarState HEADLIGHTS = new CarHeadlights();
	CarState OFF = new CarOff();

}
