public class EmployeeWage {
    public static  final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;
    private int EMP_RATE_PER_HOURS;
    private int NUM_OF_WORKING_DAYS;
    private int MAX_HRS_IN_MONTH;

    public EmployeeWage(int EMP_RATE_PER_HOURS,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH){
        this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
        this.EMP_RATE_PER_HOURS=EMP_RATE_PER_HOURS;
    }

    public int getEMP_RATE_PER_HOURS() {
        return EMP_RATE_PER_HOURS;
    }

    public int getNUM_OF_WORKING_DAYS() {
        return NUM_OF_WORKING_DAYS;
    }

    public int getMAX_HRS_IN_MONTH() {
        return MAX_HRS_IN_MONTH;
    }

    public void setNUM_OF_WORKING_DAYS(int NUM_OF_WORKING_DAYS) {
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    }

    public void setMAX_HRS_IN_MONTH(int MAX_HRS_IN_MONTH) {
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
    }

    public void setEMP_RATE_PER_HOURS(int EMP_RATE_PER_HOURS) {
        this.EMP_RATE_PER_HOURS = EMP_RATE_PER_HOURS;
    }

    public static void main(String[] args) {
        // write your code here
        EmployeeWage employeeWage=new EmployeeWage(15,20,100);


        int empHrs;
        int totalWorkingDays=0;
        int totalEmpHrs=0;

        while(totalEmpHrs<=employeeWage.getMAX_HRS_IN_MONTH() && totalWorkingDays< employeeWage.getNUM_OF_WORKING_DAYS())
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }

            totalEmpHrs+=empHrs;
            System.out.println("day#: " +totalWorkingDays + "emp hr:" +empHrs);
        }
        int totalEmpWage=totalEmpHrs * employeeWage.getEMP_RATE_PER_HOURS();
        System.out.println("total wage:" + totalEmpWage);
    }
}