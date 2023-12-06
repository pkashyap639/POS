package Employee;

public class Employee{
    private int employeeId;
    private String employeeName;
    private boolean fullTime;
    private boolean clockIn;

    public Employee(int employeeId, String employeeName, boolean fullTime, boolean clockIn) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.fullTime = fullTime;
        this.clockIn = clockIn;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isClockIn() {
        return clockIn;
    }

    public void setClockIn(boolean clockIn) {
        this.clockIn = clockIn;
    }

    public void clockIn(){
        if(!isClockIn()){
            clockIn = true;
            System.out.println(employeeName+" is clocked in");
        }else{
            System.out.println(employeeName+" is already clocked in");
        }
    }

    public void clockOut(){
        if(isClockIn()){
            clockIn = false;
            System.out.println(employeeName+ " is clocked out");
        }else{
            System.out.println("No one is clocked in");
        }
    }

    @Override
    public String toString(){
        int id = employeeId;
        String name = employeeName;
        String fullTime = isFullTime() ? "FullTime" : "ParTime";
        String clockIn = isClockIn() ? "Clocked In" : "Clocked Out";
        return name+" has Id "+id+" is a "+fullTime+" employee and is "+clockIn;
    }
}