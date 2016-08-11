package com.expensetracker.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

/**
 * Created by tma24 on 11/08/2016.
 */
@Entity
@ToString
@EqualsAndHashCode
class Expense {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id

    @ManyToOne(targetEntity = ExpenseType.class)
    ExpenseType expenseType



}
