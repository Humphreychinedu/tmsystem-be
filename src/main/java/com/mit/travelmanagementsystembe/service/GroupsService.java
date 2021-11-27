package com.mit.travelmanagementsystembe.service;

import com.mit.travelmanagementsystembe.entity.Groups;

import java.util.List;
import java.util.Optional;

public interface GroupsService {

    Optional<Groups> createGroups(Groups groups);

    Optional<Groups> updateGroups(Groups groups);

    Optional<Groups> getGroupsById(Long id);

    List<Groups> getGroups();

}
