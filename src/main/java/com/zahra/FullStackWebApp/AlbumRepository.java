package com.zahra.FullStackWebApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
