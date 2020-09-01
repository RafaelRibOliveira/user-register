package com.meckintech.resource

import com.meckintech.domain.User
import com.meckintech.service.UserService
import org.springframework.web.bind.annotation.*

@CrossOrigin
@RestController
@RequestMapping("/users")
class UserResource(private val userService: UserService) {

    @PostMapping
    fun save(@RequestBody user : User): User{
        return this.userService.save(user)
    }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): User{
        return this.userService.finById(id)
    }

}