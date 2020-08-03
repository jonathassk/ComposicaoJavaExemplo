package entities;

import enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {
  private String name;
  private WorkerLevel workerLevel;
  private Double baseSalary;
  private Departament departament;
  private List<HourContract> contracts = new ArrayList<>();

  public Worker () {
  }

  public Worker (String name, WorkerLevel workerLevel, Double baseSalary, Departament departament) {
    this.name = name;
    this.workerLevel = workerLevel;
    this.baseSalary = baseSalary;
    this.departament = departament;
  }

  public String getName() {
    return name;
  }

  public Departament getDepartament() {
    return departament;
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

  public void setDepartament(Departament departament) {
    this.departament = departament;
  }

  public void addContract (HourContract contract) {
    contracts.add(contract);
  }

  public void removeContract (HourContract contract) {
    contracts.remove(contract);
  }
}
