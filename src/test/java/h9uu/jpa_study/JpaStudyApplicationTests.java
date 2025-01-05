package h9uu.jpa_study;

import h9uu.jpa_study.Repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaStudyApplicationTests {

	@Autowired
	MemberRepository memberRepository;

	@Test
	void contextLoads() {
		memberRepository.findAll();
	}

}
