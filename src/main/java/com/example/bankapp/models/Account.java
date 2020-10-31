package com.example.bankapp.models;

import org.aspectj.lang.annotation.RequiredTypes;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class Account {

    private UUID id;

    @NotNull
    private Savings savings;

    private Checking checking;

    private Loan loan;
}
