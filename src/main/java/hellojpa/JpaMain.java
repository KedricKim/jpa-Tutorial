package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.awt.*;

public class JpaMain {

    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
//            Member member = new Member();
//            member.setId(2L);
//            member.setName("helloB");

            //조회
            Member findMember = em.find(Member.class, 1L);

            //수정
            findMember.setName("helloJ");

            //삭제
//            em.remove(findMember);

            //추가
//            em.persist(member);
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
