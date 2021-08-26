package com.company;


public class EmployeeRecord implements Prototype{

    public String name;
    public String surname;
    public int employeeId;

    public EmployeeRecord(String name, String surname, int employeeId) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
    }

    private Contract getContract(int employeeId){
        this.employeeId = employeeId;
        return new Contract();
    }

    @Override
    public Prototype getClone() {
        return new EmployeeRecord(name,surname,employeeId);
    }
}
