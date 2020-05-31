package com.example.kotlindemo2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userRepository: UserRepository) {
    @GetMapping("/users")
    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    @PostMapping("/users")
    fun createNewUser(@RequestBody name: String, @RequestBody email: String): User {
        val n = User()
        n.setName(name)
        n.setEmail(email)
        userRepository.save(n)
        return n
    }
}