package designpattern.adapter;

import designpattern.adapter.thirdparty.ThirdPartyLeaveRecord;

public class ThirdPartyAdapter implements LeaveRecord {
    ThirdPartyLeaveRecord leaveRecord;

    ThirdPartyAdapter(ThirdPartyLeaveRecord leaveRecord){
        this.leaveRecord = leaveRecord;

    }

    // ThirdPartyLeaveRecord leaveRecord = new ThirdPartyLeaveRecord();

    public String getMostAbsentEmployee() {
        return leaveRecord.getMostAbsentEmployee().getName();
    };

    public int getEmployeeAbsences(String employeeName) {
        return leaveRecord.getEmployeeAbsences(new Employee(employeeName));
    };
}
