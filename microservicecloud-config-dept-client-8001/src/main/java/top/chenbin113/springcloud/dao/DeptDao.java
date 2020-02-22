package top.chenbin113.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import top.chenbin113.springcloud.entities.Dept;

import java.util.List;

@Mapper // SpringBoot 整合 Mybatis
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
