package com.ms.Email.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.Email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {

}
