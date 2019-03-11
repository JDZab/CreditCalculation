package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreditFactory {

    int id; // Id кредита
    CreditType creditType; // Тип расчета кредита (аннуитетный или дифференцированный)
    BigDecimal annualInterestRate; // Годовая процентная ставка
    int creditTermInMonth; // Срок кредита в месяцах
    BigDecimal creditAmount; // Размер кредита (стоимость)
    LocalDate dateOfIssue; // Дата оформления (начала) кредита
    BigDecimal firstPayment; // Первый платеж (взнос) по кредиту
    BigDecimal serviceCharge; // Сервисный сбор (за ведение счета)

    public CreditFactory() {}

    public CreditFactory(int id) {
        this.id = id;
    }

    public CreditFactory creditType(CreditType value) {
        this.creditType = value;
        return this;
    }

    public CreditFactory annualInterestRate(BigDecimal value) {
        this.annualInterestRate = value;
        return this;
    }

    public CreditFactory creditTermInMonth(int value) {
        this.creditTermInMonth = value;
        return this;
    }

    public CreditFactory creditAmount(BigDecimal value) {
        this.creditAmount = value;
        return this;
    }

    public CreditFactory dateOfIssue(LocalDate value) {
        this.dateOfIssue = value;
        return this;
    }

    public CreditFactory firstPayment(BigDecimal value) {
        this.firstPayment = value;
        return this;
    }

    public CreditFactory serviceCharge(BigDecimal value) {
        this.serviceCharge = value;
        return this;
    }

    public CreditData build() {
        return new CreditData(this);
    }
}
