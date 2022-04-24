class Time{
  public static void main(String[] args){
    int hour = 22;
    int minute = 45;
    int second = 10;
    double smidnight = (hour*3600) + (minute*60) +second;
    double totaltime = (24*3600);
    double sreamin = totaltime-smidnight;
    double percentage = (smidnight/totaltime)*100;
    int ihour = 21;
    int iminute =15;
    int isecond=5;
    double ismidnight = (ihour*3600)+(iminute*60)+(isecond);
    double elapsed = (smidnight-ismidnight);
    System.out.print("Number of seconds since midnight: ");
    System.out.println(smidnight);
    System.out.println("Number of seconds remaining in the day: " + sreamin);
    System.out.println("Percentage of the Day that has passed " + percentage);
    System.out.println("Elapsed Time " + elapsed + " Seconds");
    
      }
}