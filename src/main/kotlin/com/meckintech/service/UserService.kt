package com.meckintech.service

import com.meckintech.domain.User
import com.meckintech.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    fun save(user: User): User{
        return this.userRepository.save(user)
    }
}