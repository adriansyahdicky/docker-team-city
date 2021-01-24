package co.id.teamcity.repository;

import co.id.teamcity.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>,
                                            PagingAndSortingRepository<Member, Integer> {

    @Query(value = "select * from member ", nativeQuery = true)
    Page<Member> getMemberPage(Pageable pageable);


}
