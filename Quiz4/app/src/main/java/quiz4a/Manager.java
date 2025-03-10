package quiz4a;

// 2.1 คลาส Manager สืบทอดจาก Employee ใช้แทนข้อมูลของผู้จัดการ
public class Manager extends Employee {
    private String department;
    private double bonus;

    
    // 2.2 OOP ของ Manager
    // employeeid   รหัสพนักงาน
    // name         ชื่อพนักงงาน
    // salary       เงินเดือนพื้นฐาน
    // department   แผนกที่สังกัด
    // bonus        โบนัสที่ได้รับ
    
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    // 2.3 เเสดงข้อมูลรายละเอียดของผู้จัดการ

    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };

    
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4 เเสดงข้อมูลรายละเอียดของผู้จัดการตามเงื่อนไขที่กำหนด
// codition ถ้าเป็น "full" จะเเสดงข้อมูลทั้งหมดไม่งั้นจะเเสดงค่าIDและName
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
