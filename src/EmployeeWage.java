public class EmployeeWage {

    public static void main(String[] args) {
        // write your code here
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int EMP_RATE_PER_HOURS=20;
        int empHrs;
        int empWage;
        int empCheck=(int)Math.floor(Math.random()*10) %3;
        if (empCheck == IS_FULL_TIME) {
            empHrs=8;
        }
        else if(empCheck == IS_PART_TIME){
            empHrs=4;
        }
        else{
            empHrs=0;
        }
        empWage= empHrs * EMP_RATE_PER_HOURS;
        System.out.println("emp wage:" +empWage);
    }
}
