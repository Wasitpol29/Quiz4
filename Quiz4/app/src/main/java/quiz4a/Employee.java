package quiz4a;


// (1.1) class Employee ใช้เเทนข้อมูลของพนักงานทั่วไป

public class Employee {
    private int employeeId;
    private String name;
    private double salary;

    // (1.2)คอนสตรักเตอร์สำหรับสร้าง oop Employee
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;//รหัสพนักงาน
        this.name = name;//ชื่อพนักงาน
        this.salary = (salary > 0) ? salary : 0;//เงินเดือนของพนักงานต้องมีมากว่าศูนย์ขึ้นไป
    }

    // (1.3) คำนวณเงินเดือนพนักงงาน
    public double calculateSalary() {
        return salary; // เงินเดือนที่ได้รับ
    }

    // (1.4) ดึงรหัสพนักงาน
    public int getEmployeeId() {
        return employeeId; //รหัสพนักงาน
    }

    // (1.5) ดึงชื่อพนักงาน
    public String getName() {
        return name; //ชื่อพนักงาน
    }
} 