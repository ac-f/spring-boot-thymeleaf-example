package com.acf.thymeleaf_test.controllers;

import com.acf.thymeleaf_test.pojo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/select")
public class SelectController {
  @GetMapping("")
  public String select(Model model) {
    List<Member> memberList = new ArrayList<>();
    for (int i = 0 ; i < 10 ; i++) {
      Member member = new Member();
      member.setId(Long.parseLong(i+""));
      member.setName("會員" + i + "號");
      memberList.add(member);
    }
    model.addAttribute("memberList", memberList);
    return "select";
  }
}
