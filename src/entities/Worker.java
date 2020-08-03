package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel workerLevel;
  private Double baseSalary;
  private Department department;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker (String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
    this.name = name;
    this.workerLevel = workerLevel;
    this.baseSalary = baseSalary;
    this.department = department;
  }

  public String getName() {
    return name;
  }

  public Department getDepartment() {
    return department;
  }

  public Double getBaseSalary() {
    return baseSalary;
  }

  public WorkerLevel getWorkerLevel() {
    return workerLevel;
  }

  public List<HourContract> getContracts() {
    return contracts;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBaseSalary(Double baseSalary) {
    this.baseSalary = baseSalary;
  }

  public void setWorkerLevel(WorkerLevel workerLevel) {
    this.workerLevel = workerLevel;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public void addContract (HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract (HourContract contract) {
    contracts.remove(contract);
  }

  public void income (int year, int month) {
    double sum = this.baseSalary;
    Calendar cal = Calendar.getInstance();
    for (HourContract contract : contracts) {
      cal.setTime(cal.getTime());
      int c_year = cal.get(Calendar.YEAR);
      int c_month = cal.get(Calendar.MONTH);
      if (year == c_year && month == c_month) {
        sum += contract.totalValue();
      }
    }
  }
}
