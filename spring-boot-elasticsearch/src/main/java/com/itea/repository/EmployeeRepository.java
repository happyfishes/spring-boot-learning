package com.itea.repository;

import com.itea.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

/**
 * @ClassName EmployeeRepository
 * @Describe
 * @create 2019-03-20 20:53
 * @Version 1.0
 **/
@Service
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    /**
     * 查询雇员信息
     * @param id
     * @return
     */
    Employee queryEmployeeById(String id);

}
