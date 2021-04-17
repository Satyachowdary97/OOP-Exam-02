/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Sai Satyanarayana Gullapalli
 */
public class LoanTest {

    private String loanType;
    private double loanAmount;
    private int Duration;

    public LoanTest(String loanType, double loanAmount, int Duration) {
        this.loanType = loanType;
        this.loanAmount = loanAmount;
        this.Duration = Duration;
    }

    @Override
    public String toString() {
        return "Loan Type is " + loanType + " and value of  " + loanAmount
                + " is approved for a duration of  "
                + Duration + "Years";
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

}
