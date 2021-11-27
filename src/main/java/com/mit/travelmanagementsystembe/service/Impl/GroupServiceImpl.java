package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Groups;
import com.mit.travelmanagementsystembe.service.GroupsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupsService {
    @Override
    public Optional<Groups> createGroups(Groups groups) {
        return Optional.empty();
    }

    @Override
    public Optional<Groups> updateGroups(Groups groups) {
        return Optional.empty();
    }

    @Override
    public Optional<Groups> getGroupsById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Groups> getGroups() {
        return null;
    }
}
