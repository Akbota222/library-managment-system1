package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.model.LibraryMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LibraryMemberService {
    private final List<LibraryMember> memberList = new ArrayList<>();

    // Барлық қолданушыларды алу
    public List<LibraryMember> getAllMembers() {
        return memberList;
    }

    // Жаңа қолданушы қосу
    public void addMember(LibraryMember member) {
        memberList.add(member);
    }

    // ID бойынша қолданушыны табу
    public Optional<LibraryMember> getMemberById(Long id) {
        return memberList.stream().filter(member -> member.getId().equals(id)).findFirst();
    }

    // Қолданушыны жою
    public boolean removeMember(Long id) {
        return memberList.removeIf(member -> member.getId().equals(id));
    }
}
