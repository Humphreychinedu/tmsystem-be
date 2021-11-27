package com.mit.travelmanagementsystembe.service.Impl;

import com.mit.travelmanagementsystembe.entity.Groups;
import com.mit.travelmanagementsystembe.repository.GroupsRepository;
import com.mit.travelmanagementsystembe.service.GroupsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupsService {

    private final GroupsRepository groupsRepository;

    @Override
    public Optional<Groups> createGroups(Groups groups) {
        return Optional.of(groupsRepository.save(groups));
    }

    @Override
    public Optional<Groups> updateGroups(Groups groups) {
        return Optional.of(groupsRepository.save(groups));
    }

    @Override
    public Optional<Groups> getGroupsById(Long id) {
        return groupsRepository.findById(id);
    }

    @Override
    public List<Groups> getGroups() {
        return groupsRepository.findAll();
    }

}
