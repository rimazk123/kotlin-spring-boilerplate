package com.example.kotlindemo2

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

//import javax.validation.constraints.NotBlank

@Entity
class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private var id: Int? = null
        private var name: String? = null
        private var email: String? = null
        fun getId(): Int? {
                return id
        }

        fun setId(id: Int?) {
                this.id = id
        }

        fun getName(): String? {
                return name
        }

        fun setName(name: String?) {
                this.name = name
        }

        fun getEmail(): String? {
                return email
        }

        fun setEmail(email: String?) {
                this.email = email
        }
}