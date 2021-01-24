package co.id.teamcity.service;

import co.id.teamcity.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MemberService {
    Member getMemberById(Integer id);
    Page<Member> getMemberPage(Pageable pageable);
}
