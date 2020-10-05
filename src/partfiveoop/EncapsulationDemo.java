package partfiveoop;

public class EncapsulationDemo  {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpId(1);
        e1.setEmpName("biniam");
        //we can not say e1.empId(1) or e1.empName("biniam") because they variables are private  THIS
      //  IS CALLED ENCAPSULATION

    }
}
class Employee{
    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
