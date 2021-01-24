package co.id.teamcity.service.impl;

import co.id.teamcity.entity.Member;
import co.id.teamcity.repository.MemberRepository;
import co.id.teamcity.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member getMemberById(Integer id) {
        return memberRepository.findById(id).get();
    }

    @Override
    public Page<Member> getMemberPage(Pageable pageable) {
        return memberRepository.getMemberPage(pageable);
    }
}
