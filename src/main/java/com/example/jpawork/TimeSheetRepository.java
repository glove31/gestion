package com.example.jpawork;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "timesheet", path = "timesheet")
public interface TimeSheetRepository extends PagingAndSortingRepository<TimeSheet, Long> {

}
