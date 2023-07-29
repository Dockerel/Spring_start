package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    // 필드 주입
    // @Autowired private MemberService memberService;

    // setter 주입 - public으로 설정되어 있어 중간에 바뀌면 문제 생김
    // @Autowired
    // public void setMemberService(MemberService memberService){
    //     this.memberService = memberService;
    // }

    // 생성자 주입 - ✅ 요즘 권장하는 스타일. 생성 시점에 설정하고 변화 ❌
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
