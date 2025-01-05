package h9uu.jpa_study.Repository;

import h9uu.jpa_study.entity.MemberEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberJpaRepository {

    @PersistenceContext
    private EntityManager em;

    public MemberEntity save(MemberEntity memberEntity) {
        em.persist(memberEntity);
        return memberEntity;
    }

    public MemberEntity find(Long id) {
        return em.find(MemberEntity.class, id);
    }
}
