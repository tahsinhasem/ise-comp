package events;

import def.Lot;
import workstations.Workstation;

public class Stage_Three_Begin extends Event {


  private Lot lot;
  private Workstation workstation;

  public Stage_Three_Begin(int time, Lot lot, Workstation workstation){
    super(time);

    this.lot = lot;
    this.workstation = workstation;
  }


  @Override
  public Event[] simulate() {
    return new Event[0];
  }

  @Override
  public String toString(){
    return getTime() + ": " + workstation.toString() + " started " + lot.toString();
  }
}
