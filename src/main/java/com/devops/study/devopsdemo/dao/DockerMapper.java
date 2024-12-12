package com.devops.study.devopsdemo.dao;

import org.apache.ibatis.annotations.Mapper;

import com.devops.study.devopsdemo.domain.UserRequestDTO;
import com.devops.study.devopsdemo.domain.UserResponseDTO;

@Mapper
public interface DockerMapper {
    public UserResponseDTO loginRow(UserRequestDTO params);
    public void joinRow(UserRequestDTO params);
    
} 
