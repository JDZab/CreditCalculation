package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditData extends CreditFactory {

    private int id; // Id кредита
    private CreditType creditType; // Тип расчета кредита (аннуитетный или дифференцированный)
    private BigDecimal annualInterestRate; // Годовая процентная ставка
    private int creditTermInMonth; // Срок кредита в месяцах
    private BigDecimal creditAmount; // Размер кредита (стоимость)
    private LocalDate dateOfIssue; // Дата оформления (начала) кредита
    private BigDecimal firstPayment; // Первый платеж (взнос) по кредиту
    private BigDecimal serviceCharge; // Сервисный сбор (за ведение счета)

    public CreditData(CreditFactory creditFactory) {
        this.id = creditFactory.id;
        this.creditType = creditFactory.creditType;
        this.annualInterestRate = creditFactory.annualInterestRate;
        this.creditTermInMonth = creditFactory.creditTermInMonth;
        this.creditAmount = creditFactory.creditAmount;
        this.dateOfIssue = creditFactory.dateOfIssue;
        this.firstPayment = creditFactory.firstPayment;
        this.serviceCharge = creditFactory.serviceCharge;
    }

    public int getId() { return id; }

    public CreditType getCreditType() { return creditType; }

    public BigDecimal getAnnualInterestRate() { return annualInterestRate; }

    public int getCreditTermInMonth() { return creditTermInMonth; }

    public BigDecimal getCreditAmount() { return creditAmount; }

    public LocalDate getDateOfIssue() { return dateOfIssue; }

    public BigDecimal getFirstPayment() { return firstPayment; }

    public BigDecimal getServiceCharge() { return serviceCharge; }
}
