package com.expensetracker.repositories

import com.expensetracker.domain.ExpenseType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by tma24 on 11/08/2016.
 */
@RepositoryRestResource
interface ExpenseTypeRepository extends JpaRepository <ExpenseType, Long> {


    ExpenseType findByName(String name)
}
