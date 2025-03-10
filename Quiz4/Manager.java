package quiz4a;

// 2.1
public class Manager extends Employee {
    private String department;
    private double bonus;
/**
 * คลาส `Manager` สืบทอดมาจากคลาส `Employee`
 * คลาสนี้ใช้เก็บข้อมูลพนักงานในตำแหน่งผู้จัดการ โดยมีข้อมูลเพิ่มเติมเกี่ยวกับแผนกและโบนัส
 */
    
    // 2.2
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }/**
     * คอนสตรัคเตอร์สำหรับสร้างอ็อบเจ็กต์ `Manager`
     * คอนสตรัคเตอร์นี้รับพารามิเตอร์ 5 ตัว ได้แก่ รหัสพนักงาน,ชื่อ,เงินเดือน,แผนก,โบนัส
     * 
     * @param employeeId รหัสพนักงาน
     * @param name ชื่อของพนักงาน
     * @param salary เงินเดือนของพนักงาน
     * @param department แผนกที่พนักงานจัดการ
     * @param bonus โบนัสที่พนักงานได้รับ
     */

    // 2.3
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
    } /**
    * แสดงรายละเอียดของพนักงานในตำแหน่งผู้จัดการ เช่น รหัสพนักงาน,ชื่อ,เงินเดือน,แผนก,โบนัส
    */

    //2.4
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
    }/**
     * แสดงรายละเอียดของพนักงานในตำแหน่งผู้จัดการ ตามเงื่อนไขที่กำหนด
     * ถ้าเงื่อนไขเป็น "full" จะแสดงข้อมูลทั้งหมด
     * ถ้าเงื่อนไขไม่ใช่ "full" จะแสดงเฉพาะรหัสพนักงานและชื่อ
     * 
     * @param condition เงื่อนไขในการแสดงผล เช่น "full" เพื่อแสดงข้อมูลทั้งหมด
     */
    public Double calculateBonus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculateBonus'");
    }
}
