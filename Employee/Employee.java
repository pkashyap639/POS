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
}