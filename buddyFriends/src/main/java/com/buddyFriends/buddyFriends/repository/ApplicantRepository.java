package com.buddyFriends.buddyFriends.repository;

import com.buddyFriends.buddyFriends.entity.ApplicantEntity;
import com.buddyFriends.buddyFriends.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Long> {
    List<ApplicantEntity> findByPostId(PostEntity postId);

    List<ApplicantEntity> findByPostId_PostId(Long postId);
}
