package com.healthassist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthassist.entities.LaboratoryAppointment;
@Repository
public interface LaboratoryAppointmentDao extends JpaRepository<LaboratoryAppointment, Integer> {

}
