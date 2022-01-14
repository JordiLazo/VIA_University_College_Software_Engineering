package Question_4_State_Pattern_and_Junit.statte_pattern;

public class Power1State implements RadiatorState {
    private static final int POWER = 1;

    @Override
    public void turnUp(Radiator radiator) {
        radiator.setPowerState(new Power2State());
    }

    @Override
    public void turnDown(Radiator radiator) {
        radiator.setPowerState(new OffState());
    }

    @Override
    public int getPower() {
        return POWER;
    }
}