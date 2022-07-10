public class Droid {
  String name;
  double batteryLevel;

  public Droid(String droidName) {
    name = droidName;
    batteryLevel = 100;
  }
  public String toString(){
    return "This droid\'s name is " + name;
  }

  public void performTask(String task){
    System.out.println(name + " is performing "+ task)
;
    batteryLevel -= 10;
  }
  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey.name);
    codey.performTask("eat");
    codey.performTask("jump rope");
    System.out.println(codey.batteryLevel);
  }
}
