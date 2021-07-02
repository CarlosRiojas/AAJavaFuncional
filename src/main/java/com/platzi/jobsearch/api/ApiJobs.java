package com.platzi.jobsearch.api;

import com.platzi.jobsearch.JobPosition;
import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;

import java.util.List;
import java.util.Map;

@Headers("acepta application/json")
public interface ApiJobs {

    @RequestLine("GET /positions.json ")
    List<JobPosition> jobs(@QueryMap Map<String,Object> queryMap);
}
