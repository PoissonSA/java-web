package com.gl52.euv.service.impl;

import com.gl52.euv.mapper.ProjectMapper;
import com.gl52.euv.mapper.SubjectMapper;
import com.gl52.euv.pojo.Project;
import com.gl52.euv.pojo.ProjectExample;
import com.gl52.euv.pojo.Subject;
import com.gl52.euv.pojo.SubjectExample;
import com.gl52.euv.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.*;

/**
 * 项目管理业务层
 */
@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private SubjectMapper subjectMapper;
    @Override
    public Map<String,Object>  getAllSubjects(Map<String, Object> param) {
        SubjectExample example=new SubjectExample();
        Map<String,Object> map = new HashMap<>();
        List<Subject> subjectsList =subjectMapper.selectByPageIndex(Integer.parseInt((String) param.get("offset")),Integer.parseInt((String) param.get("limit")));
        Integer total= Math.toIntExact(subjectMapper.countByExample(example));
        map.put("total",total);
        map.put("rows",subjectsList);
        return map;
    }

    @Override
    public List<Subject> getAllSubjectsName() {
        SubjectExample example=new SubjectExample();
        List<Subject> subjectsList=subjectMapper.selectByExample(example);

        return subjectsList;
    }

    @Override
    public int createSubject(String subjectName, String description,int min,int max) {
        Subject subject=new Subject();
        subject.setSubjectname(subjectName);
        subject.setDescription(description);
        subject.setCreateTime(new Date());
        subject.setNumberMax(max);
        subject.setNumberMin(min);
        return subjectMapper.insert(subject);
    }

    @Override
    public Subject getSubjectById(int subjectId) {
        return subjectMapper.selectByPrimaryKey(subjectId);
    }


}
