package solid.srp;

public class Formatter {
    private Employee employee;

    public Formatter(Employee employee) {
        this.employee = employee;
    }

    public String toHtml() {
//        const {id, name} = employee;
        String str = "<div>" +
                "<h1>Employee Info</h1>" +
                "<div id='emp" + employee.getEmpId() + "'>" +
                "<span>" + employee.getName() + "</span>" +
                "<div class='left'>" +
                "<span>Leave Left :</span>" +
                "<span>Annual Salary:</span>" +
                "<span>Manager:</span>" +
                "<span>Reimbursable Leave:</span>" +
                "</div>";

        str += "<div class='right'><span>" + (employee.getTotalLeaveAllowed() - employee.getLeaveTaken()) + "</span>";
        str += "<span>" + Math.round(employee.getMonthlySalary() * 12) + "</span>";

        if (employee.getManager() != null) str += "<span>" + employee.getManager() + "</span>";
        else str += "<span>None</span>";

        str += "<span>" + employee.getTotalleaveLeftPreviously() + "</span>";

        return str + "</div> </div>";

    }
    //other method related to customer

}
