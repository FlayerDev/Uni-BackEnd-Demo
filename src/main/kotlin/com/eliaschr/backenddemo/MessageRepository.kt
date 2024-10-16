package com.eliaschr.backenddemo

import com.eliaschr.backenddemo.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageRepository : JpaRepository<Message,Long>