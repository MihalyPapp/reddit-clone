package com.mihalypapp.redditclone.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mihalypapp.redditclone.model.Subreddit;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
	Optional<Subreddit> findByName(String subredditName);
}
