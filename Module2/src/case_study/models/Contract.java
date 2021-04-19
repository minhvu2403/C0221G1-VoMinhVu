package case_study.models;

import java.io.Serializable;

public class Contract implements Serializable {
    private String numberContract;
    private String dayStart;
    private String dayEnd;
    private  double deposit;
    private double totalMoney;

    public Contract(String numberContract, String dayStart, String dayEnd, double deposit, double totalMoney) {
        this.numberContract = numberContract;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.deposit = deposit;
        this.totalMoney = totalMoney;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract='" + numberContract + '\'' +
                ", dayStart='" + dayStart + '\'' +
                ", dayEnd='" + dayEnd + '\'' +
                ", deposit=" + deposit +
                ", totalMoney=" + totalMoney +
                '}';
    }
}
