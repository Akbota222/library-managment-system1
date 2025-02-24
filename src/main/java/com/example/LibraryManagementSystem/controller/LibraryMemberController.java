package com.example.LibraryManagementSystem.controller;

import com.example.LibraryManagementSystem.model.LibraryMember;
import com.example.LibraryManagementSystem.service.LibraryMemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/members")
public class LibraryMemberController {
    private final LibraryMemberService memberService;

    public LibraryMemberController(LibraryMemberService memberService) {
        this.memberService = memberService;
    }

    // Барлық қолданушыларды алу
    @GetMapping
    public List<LibraryMember> getAllMembers() {
        return memberService.getAllMembers();
    }

    // Жаңа қолданушы қосу
    @PostMapping
    public String addMember(@RequestBody LibraryMember member) {
        memberService.addMember(member);
        return "Қолданушы қосылды: " + member.getName();
    }

    // ID бойынша қолданушыны табу
    @GetMapping("/{id}")
    public Optional<LibraryMember> getMemberById(@PathVariable Long id) {
        return memberService.getMemberById(id);
    }

    // ID бойынша қолданушыны жою
    @DeleteMapping("/{id}")
    public String removeMember(@PathVariable Long id) {
        boolean removed = memberService.removeMember(id);
        return removed ? "Қолданушы жойылды" : "Қолданушы табылмады";
    }
}
