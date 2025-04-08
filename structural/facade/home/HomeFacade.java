
public class HomeFacade {
    Alarm alarm = new Alarm();
    AC ac = new AC();
    TV tv = new TV();

    public void goToWork(){
        alarm.alarmOn();
        ac.acOff();
        tv.tvOff();
    }


    public void comeHome(){
        alarm.alarmOff();
        ac.acOn();
        tv.tvOn();
    }
}
