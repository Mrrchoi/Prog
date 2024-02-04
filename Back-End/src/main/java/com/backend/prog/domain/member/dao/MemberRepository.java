package com.backend.prog.domain.member.dao;

import com.backend.prog.domain.member.domain.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Integer> {
    @EntityGraph(attributePaths = "roles")
    @Query("select m from Member m where m.email = :email")
    Optional<Member> getWithRoles(String email);

    Optional<Member> findByNickname(String nickname);

    Optional<Member> findByEmail(String email);

    @Query("select m from Member m where m.id = :id and m.isDeleted = false")
    Optional<Member> findByIdAndDeletedNot(Integer id);

    @Query("select m from Member m where m.email = :email and m.isDeleted = false")
    Optional<Member> findByEmailAndDeletedNot(String email);
}