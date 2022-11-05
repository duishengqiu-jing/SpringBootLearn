package com.liujing.learn.learn01.service.impl;

import com.liujing.learn.learn01.entity.Student;
import com.liujing.learn.learn01.mapper.StudentMapper;
import com.liujing.learn.learn01.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生 服务实现类
 * </p>
 *
 * @author liujing278
 * @since 2022-11-05
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
