package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dmacc.beans.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {

}
