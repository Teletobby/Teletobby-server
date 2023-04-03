package com.project.shoppingmall.service.Group;

import com.project.shoppingmall.dto.group.GroupDTO;
import com.project.shoppingmall.entity.group.Groups;
import com.project.shoppingmall.repository.Group.GroupRepository;
import com.project.shoppingmall.service.Group.impl.GroupServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Getter
@Setter
public class GroupService implements GroupServiceImpl {

    private final GroupRepository groupRepository;


    @Override
    public Groups savePosts(GroupDTO groupDTO) {
        Groups group = new Groups();
        group.setG_name(groupDTO.getG_name());
        group.setG_member(groupDTO.getG_member());
        group.setG_title(groupDTO.getG_title());
        group.setG_dueDate(groupDTO.getG_dueDate());
        group.setG_address(groupDTO.getG_address());

        Groups groups = groupRepository.save(group);
        return groups;
    }

    @Override
    public Groups findPosts(Integer g_id) {
        Groups group = groupRepository.findById(g_id).get();
        return group;
    }

    @Override
    public List<Groups> findAllPosts() {
        List<Groups> group = (List<Groups>) groupRepository.findAll();
        return group;
    }

    @Override
    public Groups alterPosts(Integer g_id, GroupDTO groupDTO) {
        Groups alter = groupRepository.findById(g_id).get();

        alter.setG_name(groupDTO.getG_name());
        alter.setG_member(groupDTO.getG_member());
        alter.setG_title(groupDTO.getG_title());
        alter.setG_dueDate(groupDTO.getG_dueDate());

        Groups save = groupRepository.save(alter);
        return save;
    }

    @Override
    public void deletePosts(Integer g_id) {
        groupRepository.deleteById(g_id);
    }
}
