package Question_4_State_Pattern_and_Junit.statte_pattern;

public class Radiator implements RadiatorState{
    private RadiatorState currentstate = new OffState();

    @Override
    public void turnUp(Radiator radiator) {
        currentstate.turnUp(radiator);
    }

    @Override
    public void turnDown(Radiator radiator) {
        currentstate.turnDown(radiator);
    }

    @Override
    public int getPower() {
        return currentstate.getPower();
    }

    public void setPowerState(RadiatorState currentstate) {
        this.currentstate = currentstate;
    }
}
