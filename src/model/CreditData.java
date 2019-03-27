package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditData {

    private int dataId; // Id кредита
    private CreditType creditType; // Тип расчета кредита (аннуитетный или дифференцированный)
    private BigDecimal annualInterestRate; // Годовая процентная ставка
    private int creditTermInMonth; // Срок кредита в месяцах
    private BigDecimal creditAmount; // Размер кредита (стоимость)
    private LocalDate dateOfIssue; // Дата оформления (начала) кредита
    private BigDecimal firstPayment; // Первый платеж (взнос) по кредиту
    private BigDecimal serviceCharge; // Сервисный сбор (за ведение счета)

    CreditData(CreditDataBuild creditDataBuild) {
        this.dataId = creditDataBuild.dataId;
        this.creditType = creditDataBuild.creditType;
        this.annualInterestRate = creditDataBuild.annualInterestRate;
        this.creditTermInMonth = creditDataBuild.creditTermInMonth;
        this.creditAmount = creditDataBuild.creditAmount;
        this.dateOfIssue = creditDataBuild.dateOfIssue;
        this.firstPayment = creditDataBuild.firstPayment;
        this.serviceCharge = creditDataBuild.serviceCharge;
    }

    public static class CreditDataBuild {

        private int dataId; // Id кредита
        private CreditType creditType; // Тип расчета кредита (аннуитетный или дифференцированный)
        private BigDecimal annualInterestRate; // Годовая процентная ставка
        private int creditTermInMonth; // Срок кредита в месяцах
        private BigDecimal creditAmount; // Размер кредита (стоимость)
        private LocalDate dateOfIssue; // Дата оформления (начала) кредита
        private BigDecimal firstPayment; // Первый платеж (взнос) по кредиту
        private BigDecimal serviceCharge; // Сервисный сбор (за ведение счета)

        CreditDataBuild(int id) { dataId = id; }

        public CreditDataBuild creditType(CreditType value) {
            this.creditType = value;
            return this;
        }

        public CreditDataBuild annualInterestRate(BigDecimal value) {
            this.annualInterestRate = value;
            return this;
        }

        public CreditDataBuild creditTermInMonth(int value) {
            this.creditTermInMonth = value;
            return this;
        }

        public CreditDataBuild creditAmount(BigDecimal value) {
            this.creditAmount = value;
            return this;
        }

        public CreditDataBuild dateOfIssue(LocalDate value) {
            this.dateOfIssue = value;
            return this;
        }

        public CreditDataBuild firstPayment(BigDecimal value) {
            this.firstPayment = value;
            return this;
        }

        public CreditDataBuild serviceCharge(BigDecimal value) {
            this.serviceCharge = value;
            return this;
        }

        public CreditData build() {
            return new CreditData(this);
        }
    }

    public int getId() { return dataId; }

    public CreditType getCreditType() { return creditType; }

    public BigDecimal getAnnualInterestRate() { return annualInterestRate; }

    public int getCreditTermInMonth() { return creditTermInMonth; }

    public BigDecimal getCreditAmount() { return creditAmount; }

    public LocalDate getDateOfIssue() { return dateOfIssue; }

    public BigDecimal getFirstPayment() { return firstPayment; }

    public BigDecimal getServiceCharge() { return serviceCharge; }
}
