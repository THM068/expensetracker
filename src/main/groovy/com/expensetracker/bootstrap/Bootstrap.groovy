package com.expensetracker.bootstrap

import com.expensetracker.domain.ExpenseType
import com.expensetracker.repositories.ExpenseTypeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * Created by tma24 on 11/08/2016.
 */

@Component
class Bootstrap  implements CommandLineRunner {

    @Autowired ExpenseTypeRepository expenseTypeRepository

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

        expenseTypeRepository.findAll().each { println it }
    }
}
