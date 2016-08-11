package com.expensetracker.bootstrap

import com.expensetracker.domain.ExpenseType
import com.expensetracker.domain.Expense
import com.expensetracker.repositories.ExpenseTypeRepository
import com.expensetracker.repositories.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

import java.time.LocalDate
import java.time.ZoneId

/**
 * Created by tma24 on 11/08/2016.
 */

@Component
class Bootstrap  implements CommandLineRunner {

    @Autowired ExpenseTypeRepository expenseTypeRepository
    @Autowired ExpenseRepository  expenseRepository

    @Override
    void run(String... args) throws Exception {
        def expenseTypes = ['Rent', 'Council Tax', 'Credit Card', 'Gas', 'Water', 'Electricity', 'Other']

        for(String name: expenseTypes) {
            ExpenseType expenseType = expenseTypeRepository.findByName(name)

            if(!expenseType) {
                expenseType = new ExpenseType(name: name)
                expenseTypeRepository.save(expenseType)
            }
        }
        ExpenseType expenseType = expenseTypeRepository.findByName('Other')
        if(expenseType) {
            Expense  expense = new Expense()
            expense.expenseType = expenseType
            expense.description = 'Rent'
            expense.amount = 23.78
            expense.purchaseDate = Date.from(LocalDate.of(2016, 8, 10).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())
            expenseRepository.save(expense)
        }
        expenseTypeRepository.findAll().each { println it }
        println '-----------------------------------------'
        expenseRepository.findAll().each { println it }
    }
}
