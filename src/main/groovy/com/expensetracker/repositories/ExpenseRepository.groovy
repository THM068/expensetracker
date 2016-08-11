package com.expensetracker.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by tma24 on 11/08/2016.
 */
@RepositoryRestResource
interface ExpenseRepository extends JpaRepository <com.expensetracker.domain.Expense,Long> {
}
