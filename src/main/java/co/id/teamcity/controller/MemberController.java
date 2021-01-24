package co.id.teamcity.controller;

import co.id.teamcity.entity.Member;
import co.id.teamcity.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/member")
public class MemberController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemberController.class);

    @Autowired
    private MemberService memberService;

    @GetMapping(value = "/get-member-page")
    public ResponseEntity<?> getMemberPage(Pageable pageable){
        try{
            Page<Member> getDataMember = memberService.getMemberPage(pageable);
            return ResponseEntity.ok(getDataMember);
        }catch (Exception ex){
            LOGGER.error("error controller getMemberPage : "+ex.getMessage());
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/get-memberbyid/{id}")
    public ResponseEntity<?> getMemberById(@PathVariable("id") Integer id){
        try{
            Member getMemberById = memberService.getMemberById(id);
            LOGGER.info("data member : "+getMemberById);
            return ResponseEntity.ok(getMemberById);
        }catch (Exception ex){
            LOGGER.error("error controller getMemberById : "+ex.getMessage());
            return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}