package com.ruoyi.api.service.impl;

import com.ruoyi.api.mapper.AlarmMapper;
import com.ruoyi.api.mapper.UserMapper;
import com.ruoyi.api.service.IAlarmService;
import com.ruoyi.api.service.IUserService;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.domain.VAlarmhis;
import com.ruoyi.system.domain.VLive;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hanyihu
 * @title
 * @date 2019/11/7 9:17
 */
@Service
public class AlarmServiceImpl implements IAlarmService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private AlarmMapper alarmMapper;


    @Override
    public List<VLive> getRealData(String queryJson) {
        return alarmMapper.getRealData(queryJson);
    }

    @Override
    public List<VAlarmhis> getAlarmCountByDay(String date) {
        return alarmMapper.getAlarmCountByDay(date);
    }

    @Override public List<VAlarmhis> getAlarmHis(String date) { return alarmMapper.getAlarmHis(date); }
}
