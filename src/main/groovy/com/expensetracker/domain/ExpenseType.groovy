package com.expensetracker.domain

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by tma24 on 11/08/2016.
 */
@Entity
@EqualsAndHashCode(includes = ['name'])
@ToString(includes = ['name'], includeNames = true)
class ExpenseType {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    Long id

    @Column(name="name", nullable = false)
    String name
    Date dateCreated = new Date();

}
