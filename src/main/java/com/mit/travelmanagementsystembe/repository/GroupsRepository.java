package com.mit.travelmanagementsystembe.repository;


import com.mit.travelmanagementsystembe.entity.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepository extends JpaRepository<Groups, Long> {
}
